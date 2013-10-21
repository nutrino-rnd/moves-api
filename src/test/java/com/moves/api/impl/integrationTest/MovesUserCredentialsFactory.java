package com.moves.api.impl.integrationTest;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.client.MovesUserCredentials;

@Component
public class MovesUserCredentialsFactory implements IMovesUserCredentialsFactory {

    private IMoveUserCredentials credentials;

    @Inject
    public MovesUserCredentialsFactory(@Value("${com.moves.api.test.token}") String token, @Value("${com.moves.api.test.secret}") String secret) {
	this.credentials = new MovesUserCredentials(token, secret);
    }

    @Override
    public IMoveUserCredentials getMovesCredentials() {
	return this.credentials;
    }
}
