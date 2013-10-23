package co.nutrino.api.moves.impl.client.activity;

import java.util.Date;

import javax.inject.Inject;


import org.springframework.stereotype.Component;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.client.IMoveUserCredentials;
import co.nutrino.api.moves.impl.client.IMovesClient;
import co.nutrino.api.moves.impl.request.IMovesDatesRequestParametersCreator;
import co.nutrino.api.moves.impl.request.MovesObject;
import co.nutrino.api.moves.impl.request.MovesResource;
import co.nutrino.api.moves.impl.response.serialize.MovesDateParser;
import co.nutrino.api.moves.request.RequestParameters;


@Component
class MovesUserStorylineResourceClient implements IMovesUserStorylineResourceClient {

    private IMovesClient client;
    private IMovesDatesRequestParametersCreator requestParametersCreator;

    @Inject
    public MovesUserStorylineResourceClient(IMovesClient client, IMovesDatesRequestParametersCreator requestParametersCreator) {
	this.client = client;
	this.requestParametersCreator = requestParametersCreator;
    }

    @Override
    public <T> T getUserStorylineResourceForDay(IMoveUserCredentials credentials, MovesResource resource, Date date, Class<T> c)
	    throws ResourceException, OAuthException {
	String dateString = MovesDateParser.toShortString(date);
	return this.client.getProtectedResource(credentials, MovesObject.user, resource, new String[] { "daily", dateString }, c);
    }

    @Override
    public <T> T getUserStorylineResourceForWeek(IMoveUserCredentials credentials, MovesResource resource, Date date, Class<T> c)
	    throws ResourceException, OAuthException {
	String dateString = MovesDateParser.toWeekString(date);
	return this.client.getProtectedResource(credentials, MovesObject.user, resource, new String[] { "daily", dateString }, c);
    }

    @Override
    public <T> T getUserStorylineResourceForMonth(IMoveUserCredentials credentials, MovesResource resource, Date date, Class<T> c)
	    throws ResourceException, OAuthException {
	String dateString = MovesDateParser.toMonthString(date);
	return this.client.getProtectedResource(credentials, MovesObject.user, resource, new String[] { "daily", dateString }, c);
    }

    @Override
    public <T> T getUserStorylineResourceForDates(IMoveUserCredentials credentials, MovesResource resource, Date from, Date to, Class<T> c)
	    throws ResourceException, OAuthException {
	RequestParameters requestParameters = this.requestParametersCreator.createDatesIntervalRequestParameters(from, to);
	return this.client.getProtectedResource(credentials, MovesObject.user, resource, new String[] { "daily" }, requestParameters, c);
    }

    @Override
    public <T> T getUserStorylineResourceForDates(IMoveUserCredentials credentials, MovesResource resource, int numberOfDays, Class<T> c)
	    throws ResourceException, OAuthException {
	RequestParameters requestParameters = this.requestParametersCreator.createPastDaysRequestParameters(numberOfDays);
	return this.client.getProtectedResource(credentials, MovesObject.user, resource, new String[] { "daily" }, requestParameters, c);
    }
}
