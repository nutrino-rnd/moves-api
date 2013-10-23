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
public class MovesUserPlacesClient implements IMovesUserPlacesClient {

    private IMovesUserStorylineResourceClient client;

    @Inject
    public MovesUserPlacesClient(IMovesUserStorylineResourceClient client) {
	this.client = client;
    }

    @Override
    public MovesStoryline[] getUserPlacesForDay(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForDay(credentials, MovesResource.places, date, MovesStoryline[].class);
    }

    @Override
    public MovesStoryline[] getUserPlacesForWeek(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForWeek(credentials, MovesResource.places, date, MovesStoryline[].class);
    }

    @Override
    public MovesStoryline[] getUserPlacesForDates(IMoveUserCredentials credentials, Date from, Date to) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForDates(credentials, MovesResource.places, from, to, MovesStoryline[].class);
    }

    @Override
    public MovesStoryline[] getUserPlacesForPastDays(IMoveUserCredentials credentials, int numberOfDays) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForDates(credentials, MovesResource.places, numberOfDays, MovesStoryline[].class);
    }
}
