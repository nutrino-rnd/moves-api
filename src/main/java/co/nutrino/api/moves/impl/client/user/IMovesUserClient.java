package co.nutrino.api.moves.impl.client.user;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.client.IMoveUserCredentials;
import co.nutrino.api.moves.impl.dto.user.MovesUser;

public interface IMovesUserClient {

    public MovesUser getUser(IMoveUserCredentials credentials) throws ResourceException, OAuthException;

}