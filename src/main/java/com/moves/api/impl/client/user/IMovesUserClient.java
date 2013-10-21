package com.moves.api.impl.client.user;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.dto.user.MovesUser;

public interface IMovesUserClient {

    public MovesUser getUser(IMoveUserCredentials credentials) throws ResourceException, OAuthException;

}