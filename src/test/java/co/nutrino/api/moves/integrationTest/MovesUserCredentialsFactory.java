package co.nutrino.api.moves.integrationTest;

import javax.inject.Inject;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import co.nutrino.api.moves.impl.client.IMoveUserCredentials;
import co.nutrino.api.moves.impl.client.MovesUserCredentials;


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
