package co.nutrino.api.moves.impl.client.activity;

import java.util.Date;

import javax.inject.Inject;


import org.springframework.stereotype.Component;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.client.IMoveUserCredentials;
import co.nutrino.api.moves.impl.dto.storyline.MovesStoryline;
import co.nutrino.api.moves.impl.request.MovesResource;


@Component
public class MovesUserActivityClient implements IMovesUserActivityClient {

    private IMovesUserStorylineResourceClient client;

    @Inject
    public MovesUserActivityClient(IMovesUserStorylineResourceClient client) {
	this.client = client;
    }

    @Override
    public MovesStoryline[] getUserActivityForDay(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForDay(credentials, MovesResource.activities, date, MovesStoryline[].class);
    }

    @Override
    public MovesStoryline[] getUserActivityForWeek(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForWeek(credentials, MovesResource.activities, date, MovesStoryline[].class);
    }

    @Override
    public MovesStoryline[] getUserActivityForDates(IMoveUserCredentials credentials, Date from, Date to) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForDates(credentials, MovesResource.activities, from, to, MovesStoryline[].class);
    }

    @Override
    public MovesStoryline[] getUserActivityForPastDays(IMoveUserCredentials credentials, int numberOfDays) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForDates(credentials, MovesResource.activities, numberOfDays, MovesStoryline[].class);
    }
}
