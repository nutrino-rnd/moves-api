package com.moves.api.impl.service;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.request.MovesAuthenticationResource;
import com.moves.api.impl.request.MovesObject;
import com.moves.api.impl.request.MovesResource;
import com.moves.api.request.IAuthToken;
import com.moves.api.request.RequestParameters;

public interface IMovesOAuthService {

    public <T> T getProtectedResource(MovesObject object, MovesResource resource, String[] pathParameters, RequestParameters requestParameters,
	    IAuthToken token, Class<T> c) throws ResourceException, OAuthException;

    public <T> T getAuthenticationResource(MovesAuthenticationResource resource, RequestParameters requestParameters, IAuthToken token, Class<T> c)
	    throws ResourceException;

    public <T> T postAuthenticationResource(MovesAuthenticationResource resource, RequestParameters requestParameters, IAuthToken token, Class<T> c)
	    throws ResourceException;
}