package co.nutrino.api.moves.impl.client.activity;

import java.util.Date;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.client.IMoveUserCredentials;
import co.nutrino.api.moves.impl.dto.storyline.MovesStoryline;



public interface IMovesUserActivityClient {

    public MovesStoryline[] getUserActivityForDay(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException;

    public MovesStoryline[] getUserActivityForWeek(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException;

    public MovesStoryline[] getUserActivityForDates(IMoveUserCredentials credentials, Date from, Date to) throws ResourceException, OAuthException;

    public MovesStoryline[] getUserActivityForPastDays(IMoveUserCredentials credentials, int numberOfDays) throws ResourceException, OAuthException;

}