package com.moves.api.impl.client;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.dto.authentication.UserMovesAuthentication;
import com.moves.api.impl.request.MovesAuthenticationResource;
import com.moves.api.impl.request.MovesObject;
import com.moves.api.impl.request.MovesResource;
import com.moves.api.impl.service.IMovesOAuthService;
import com.moves.api.request.IAuthToken;
import com.moves.api.request.IRequestTokenConvertor;
import com.moves.api.request.RequestParameters;

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
