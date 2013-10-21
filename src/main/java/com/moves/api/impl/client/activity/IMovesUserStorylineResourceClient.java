package com.moves.api.impl.client.activity;

import java.util.Date;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.request.MovesResource;

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