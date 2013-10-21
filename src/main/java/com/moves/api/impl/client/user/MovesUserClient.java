package com.moves.api.impl.client.user;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.client.IMovesClient;
import com.moves.api.impl.dto.user.MovesUser;
import com.moves.api.impl.request.MovesObject;
import com.moves.api.impl.request.MovesResource;

@Component
public class MovesUserClient implements IMovesUserClient {

    private IMovesClient client;

    @Inject
    public MovesUserClient(IMovesClient client) {
	this.client = client;
    }

    @Override
    public MovesUser getUser(IMoveUserCredentials credentials) throws ResourceException, OAuthException {
	return this.client.getProtectedResource(credentials, MovesObject.user, MovesResource.profile, MovesUser.class);
    }
}
