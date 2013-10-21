package com.moves.api.impl.client.authentication;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.dto.authentication.UserMovesAuthentication;

public interface IMovesAuthenticationClient {

    public boolean validateAuthentication(IMoveUserCredentials credentials) throws OAuthException;

    public UserMovesAuthentication refreshAuthentication(IMoveUserCredentials credentials) throws ResourceException, OAuthException;

}