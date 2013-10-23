package co.nutrino.api.moves.impl.service;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.request.MovesAuthenticationResource;
import co.nutrino.api.moves.impl.request.MovesObject;
import co.nutrino.api.moves.impl.request.MovesResource;
import co.nutrino.api.moves.request.IAuthToken;
import co.nutrino.api.moves.request.RequestParameters;

public interface IMovesOAuthService {

    public <T> T getProtectedResource(MovesObject object, MovesResource resource, String[] pathParameters, RequestParameters requestParameters,
	    IAuthToken token, Class<T> c) throws ResourceException, OAuthException;

    public <T> T getAuthenticationResource(MovesAuthenticationResource resource, RequestParameters requestParameters, IAuthToken token, Class<T> c)
	    throws ResourceException;

    public <T> T postAuthenticationResource(MovesAuthenticationResource resource, RequestParameters requestParameters, IAuthToken token, Class<T> c)
	    throws ResourceException;
}