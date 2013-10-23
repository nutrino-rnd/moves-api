package co.nutrino.api.moves.impl.client;

import javax.inject.Inject;


import org.springframework.stereotype.Component;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.dto.authentication.UserMovesAuthentication;
import co.nutrino.api.moves.impl.request.MovesAuthenticationResource;
import co.nutrino.api.moves.impl.request.MovesObject;
import co.nutrino.api.moves.impl.request.MovesResource;
import co.nutrino.api.moves.impl.service.IMovesOAuthService;
import co.nutrino.api.moves.request.IAuthToken;
import co.nutrino.api.moves.request.IRequestTokenConvertor;
import co.nutrino.api.moves.request.RequestParameters;


@Component
public class MovesClient implements IMovesClient {

    private IRequestTokenConvertor requestTokenConvertor;
    private IMovesOAuthService service;

    @Inject
    public MovesClient(IRequestTokenConvertor requestTokenConvertor, IMovesOAuthService service) {
	this.requestTokenConvertor = requestTokenConvertor;
	this.service = service;
    }

    @Override
    public <T> T getProtectedResource(IMoveUserCredentials credentials, MovesObject object, MovesResource resource, Class<T> c)
	    throws ResourceException, OAuthException {
	return getProtectedResource(credentials, object, resource, null, c);
    }

    @Override
    public <T> T getProtectedResource(IMoveUserCredentials credentials, MovesObject object, MovesResource resource, String[] pathParameters,
	    Class<T> c) throws ResourceException, OAuthException {
	return getProtectedResource(credentials, object, resource, pathParameters, null, c);
    }

    @Override
    public <T> T getProtectedResource(IMoveUserCredentials credentials, MovesObject object, MovesResource resource, String[] pathParameters,
	    RequestParameters requestParameters, Class<T> c) throws ResourceException, OAuthException {
	IAuthToken token = this.requestTokenConvertor.getRequestToken(credentials);
	return this.service.getProtectedResource(object, resource, pathParameters, requestParameters, token, c);
    }

    @Override
    public UserMovesAuthentication getAuthenticationResource(IMoveUserCredentials credentials, MovesAuthenticationResource resource,
	    RequestParameters requestParameters) throws ResourceException, OAuthException {
	IAuthToken token = this.requestTokenConvertor.getRequestToken(credentials);
	return this.service.getAuthenticationResource(resource, requestParameters, token, UserMovesAuthentication.class);
    }

    @Override
    public UserMovesAuthentication postAuthenticationResource(IMoveUserCredentials credentials, MovesAuthenticationResource resource,
	    RequestParameters requestParameters) throws ResourceException, OAuthException {
	IAuthToken token = this.requestTokenConvertor.getRequestToken(credentials);
	return this.service.postAuthenticationResource(resource, requestParameters, token, UserMovesAuthentication.class);
    }
}
