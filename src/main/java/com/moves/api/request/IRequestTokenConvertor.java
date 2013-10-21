package com.moves.api.request;

import com.moves.api.impl.client.IMoveUserCredentials;

public interface IRequestTokenConvertor {

    public IAuthToken getRequestToken(IMoveUserCredentials credentials);

    public IAuthToken getEmptyRequestToken();

}