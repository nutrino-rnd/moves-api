package co.nutrino.api.moves.request;

import co.nutrino.api.moves.impl.client.IMoveUserCredentials;

public interface IRequestTokenConvertor {

    public IAuthToken getRequestToken(IMoveUserCredentials credentials);

    public IAuthToken getEmptyRequestToken();

}