package co.nutrino.api.moves.impl.client.authentication;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.client.IMoveUserCredentials;
import co.nutrino.api.moves.impl.dto.authentication.UserMovesAuthentication;

public interface IMovesAuthenticationClient {

    public boolean validateAuthentication(IMoveUserCredentials credentials) throws OAuthException;

    public UserMovesAuthentication refreshAuthentication(IMoveUserCredentials credentials) throws ResourceException, OAuthException;

}