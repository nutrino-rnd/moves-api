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
