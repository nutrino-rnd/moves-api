package co.nutrino.api.moves.impl.client;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.dto.authentication.UserMovesAuthentication;
import co.nutrino.api.moves.impl.request.MovesAuthenticationResource;
import co.nutrino.api.moves.impl.request.MovesObject;
import co.nutrino.api.moves.impl.request.MovesResource;
import co.nutrino.api.moves.request.RequestParameters;

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
