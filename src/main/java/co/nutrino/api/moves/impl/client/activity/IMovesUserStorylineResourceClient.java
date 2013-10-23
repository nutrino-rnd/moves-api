package co.nutrino.api.moves.impl.client.activity;

import java.util.Date;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.client.IMoveUserCredentials;
import co.nutrino.api.moves.impl.request.MovesResource;



interface IMovesUserStorylineResourceClient {

    public <T> T getUserStorylineResourceForDay(IMoveUserCredentials credentials, MovesResource resource, Date date, Class<T> c)
	    throws ResourceException, OAuthException;

    public <T> T getUserStorylineResourceForWeek(IMoveUserCredentials credentials, MovesResource resource, Date date, Class<T> c)
	    throws ResourceException, OAuthException;

    public <T> T getUserStorylineResourceForMonth(IMoveUserCredentials credentials, MovesResource resource, Date date, Class<T> c)
	    throws ResourceException, OAuthException;

    public <T> T getUserStorylineResourceForDates(IMoveUserCredentials credentials, MovesResource resource, Date from, Date to, Class<T> c)
	    throws ResourceException, OAuthException;

    public <T> T getUserStorylineResourceForDates(IMoveUserCredentials credentials, MovesResource resource, int numberOfDays, Class<T> c)
	    throws ResourceException, OAuthException;

}