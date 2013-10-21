package com.moves.api.impl.client.activity;

import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.client.IMovesClient;
import com.moves.api.impl.request.IMovesDatesRequestParametersCreator;
import com.moves.api.impl.request.MovesObject;
import com.moves.api.impl.request.MovesResource;
import com.moves.api.impl.response.serialize.MovesDateParser;
import com.moves.api.request.RequestParameters;

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
