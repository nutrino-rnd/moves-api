package com.moves.api.request;

import org.springframework.stereotype.Component;

import com.moves.api.impl.client.IMoveUserCredentials;

@Component
public class RequestTokenConvertor implements IRequestTokenConvertor {

    @Override
    public IAuthToken getRequestToken(IMoveUserCredentials credentials) {
	return new AuthToken(credentials.getToken(), credentials.getRefreshToken(), null);
    }

    @Override
    public IAuthToken getEmptyRequestToken() {
	return new AuthToken("", "", null);
    }
}
