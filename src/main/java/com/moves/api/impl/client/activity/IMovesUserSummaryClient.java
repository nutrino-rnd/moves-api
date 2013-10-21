package com.moves.api.impl.client.activity;

import java.util.Date;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.dto.summary.UserActivitySummary;

public interface IMovesUserSummaryClient {

    public UserActivitySummary[] getUserSummaryForDay(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException;

    public UserActivitySummary[] getUserSummaryForWeek(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException;

    public UserActivitySummary[] getUserSummaryForMonth(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException;

    public UserActivitySummary[] getUserSummaryForDates(IMoveUserCredentials credentials, Date from, Date to) throws ResourceException,
	    OAuthException;

    public UserActivitySummary[] getUserSummaryForPastDays(IMoveUserCredentials credentials, int numberOfDays) throws ResourceException,
	    OAuthException;

}
