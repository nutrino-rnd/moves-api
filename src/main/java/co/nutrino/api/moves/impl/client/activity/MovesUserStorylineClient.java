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
public class MovesUserStorylineClient implements IMovesUserStorylineClient {

    private IMovesUserStorylineResourceClient client;

    @Inject
    public MovesUserStorylineClient(IMovesUserStorylineResourceClient client) {
	this.client = client;
    }

    @Override
    public MovesStoryline[] getUserStorylineForDay(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForDay(credentials, MovesResource.storyline, date, MovesStoryline[].class);
    }

    @Override
    public MovesStoryline[] getUserStorylineForWeek(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForWeek(credentials, MovesResource.storyline, date, MovesStoryline[].class);
    }

    @Override
    public MovesStoryline[] getUserStorylineForDates(IMoveUserCredentials credentials, Date from, Date to) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForDates(credentials, MovesResource.storyline, from, to, MovesStoryline[].class);
    }

    @Override
    public MovesStoryline[] getUserStorylineForPastDays(IMoveUserCredentials credentials, int numberOfDays) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForDates(credentials, MovesResource.storyline, numberOfDays, MovesStoryline[].class);
    }
}
