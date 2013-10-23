package co.nutrino.api.moves.impl.client.activity;

import java.util.Date;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.client.IMoveUserCredentials;
import co.nutrino.api.moves.impl.dto.summary.UserActivitySummary;



public interface IMovesUserSummaryClient {

    public UserActivitySummary[] getUserSummaryForDay(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException;

    public UserActivitySummary[] getUserSummaryForWeek(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException;

    public UserActivitySummary[] getUserSummaryForMonth(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException;

    public UserActivitySummary[] getUserSummaryForDates(IMoveUserCredentials credentials, Date from, Date to) throws ResourceException,
	    OAuthException;

    public UserActivitySummary[] getUserSummaryForPastDays(IMoveUserCredentials credentials, int numberOfDays) throws ResourceException,
	    OAuthException;

}
