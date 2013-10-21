package com.moves.api.impl.client;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.dto.authentication.UserMovesAuthentication;
import com.moves.api.impl.request.MovesAuthenticationResource;
import com.moves.api.impl.request.MovesObject;
import com.moves.api.impl.request.MovesResource;
import com.moves.api.request.RequestParameters;

public interface IMovesClient {

    public <T> T getProtectedResource(IMoveUserCredentials credentials, MovesObject object, MovesResource resource, Class<T> c)
	    throws ResourceException, OAuthException;

    public <T> T getProtectedResource(IMoveUserCredentials credentials, MovesObject object, MovesResource resource, String[] pathParameters,
	    Class<T> c) throws ResourceException, OAuthException;

    public <T> T getProtectedResource(IMoveUserCredentials credentials, MovesObject object, MovesResource resource, String[] pathParameters,
	    RequestParameters requestParameters, Class<T> c) throws ResourceException, OAuthException;

    public UserMovesAuthentication getAuthenticationResource(IMoveUserCredentials credentials, MovesAuthenticationResource resource,
	    RequestParameters requestParameters) throws ResourceException, OAuthException;

    public UserMovesAuthentication postAuthenticationResource(IMoveUserCredentials credentials, MovesAuthenticationResource resource,
	    RequestParameters requestParameters) throws ResourceException, OAuthException;
}
