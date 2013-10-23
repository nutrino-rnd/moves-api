package co.nutrino.api.moves.impl.client.user;

import javax.inject.Inject;


import org.springframework.stereotype.Component;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.client.IMoveUserCredentials;
import co.nutrino.api.moves.impl.client.IMovesClient;
import co.nutrino.api.moves.impl.dto.user.MovesUser;
import co.nutrino.api.moves.impl.request.MovesObject;
import co.nutrino.api.moves.impl.request.MovesResource;


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
