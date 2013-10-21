package com.moves.api.impl.client.activity;

import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.dto.summary.UserActivitySummary;
import com.moves.api.impl.request.MovesResource;

@Component
public class MovesUserSummaryClient implements IMovesUserSummaryClient {

    private IMovesUserStorylineResourceClient client;

    @Inject
    public MovesUserSummaryClient(IMovesUserStorylineResourceClient client) {
	this.client = client;
    }

    @Override
    public UserActivitySummary[] getUserSummaryForDay(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForDay(credentials, MovesResource.summary, date, UserActivitySummary[].class);
    }

    @Override
    public UserActivitySummary[] getUserSummaryForWeek(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForWeek(credentials, MovesResource.summary, date, UserActivitySummary[].class);
    }

    @Override
    public UserActivitySummary[] getUserSummaryForMonth(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException {
	return this.client.getUserStorylineResourceForMonth(credentials, MovesResource.summary, date, UserActivitySummary[].class);
    }

    @Override
    public UserActivitySummary[] getUserSummaryForDates(IMoveUserCredentials credentials, Date from, Date to) throws ResourceException,
	    OAuthException {
	return this.client.getUserStorylineResourceForDates(credentials, MovesResource.summary, from, to, UserActivitySummary[].class);
    }

    @Override
    public UserActivitySummary[] getUserSummaryForPastDays(IMoveUserCredentials credentials, int numberOfDays) throws ResourceException,
	    OAuthException {
	return this.client.getUserStorylineResourceForDates(credentials, MovesResource.summary, numberOfDays, UserActivitySummary[].class);
    }
}
