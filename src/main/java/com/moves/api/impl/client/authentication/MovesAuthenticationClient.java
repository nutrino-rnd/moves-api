package com.moves.api.impl.client.authentication;

import java.util.Arrays;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.client.IMovesClient;
import com.moves.api.impl.dto.authentication.UserMovesAuthentication;
import com.moves.api.impl.request.MovesAuthenticationResource;
import com.moves.api.impl.service.IMovesSecurityManager;
import com.moves.api.request.RequestParameter;
import com.moves.api.request.RequestParameters;

@Component
public class MovesAuthenticationClient implements IMovesAuthenticationClient {

    private IMovesClient client;
    private IMovesSecurityManager securityManager;

    @Inject
    public MovesAuthenticationClient(IMovesClient client, IMovesSecurityManager securityManager) {
	this.client = client;
	this.securityManager = securityManager;
    }

    @Override
    public boolean validateAuthentication(IMoveUserCredentials credentials) throws OAuthException {

	try {
	    this.client.getAuthenticationResource(credentials, MovesAuthenticationResource.tokeninfo, null);
	} catch (ResourceException e) {
	    return false;
	}

	return true;
    }

    @Override
    public UserMovesAuthentication refreshAuthentication(IMoveUserCredentials credentials) throws ResourceException, OAuthException {
	RequestParameter requestParameter1 = new RequestParameter("grant_type", "refresh_token");
	RequestParameter requestParameter2 = new RequestParameter("refresh_token", credentials.getRefreshToken());
	RequestParameter requestParameter3 = new RequestParameter("client_id", this.securityManager.getKey());
	RequestParameter requestParameter4 = new RequestParameter("client_secret", this.securityManager.getSecret());

	RequestParameters requestParameters = new RequestParameters(Arrays.asList(new RequestParameter[] { requestParameter1, requestParameter2,
		requestParameter3, requestParameter4 }));

	UserMovesAuthentication authentication = this.client.postAuthenticationResource(credentials, MovesAuthenticationResource.access_token,
		requestParameters);

	return authentication;
    }
}
