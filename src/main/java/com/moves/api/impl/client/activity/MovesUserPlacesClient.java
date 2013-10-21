package com.moves.api.impl.client.activity;

import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.dto.storyline.MovesStoryline;
import com.moves.api.impl.request.MovesResource;

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
