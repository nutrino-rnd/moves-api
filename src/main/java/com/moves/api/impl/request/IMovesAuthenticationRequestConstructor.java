package com.moves.api.impl.request;


import org.scribe.model.OAuthRequest;
import org.scribe.model.Verb;

import com.moves.api.request.RequestParameters;

public interface IMovesAuthenticationRequestConstructor {

    public OAuthRequest constructRequest(Verb verb, MovesAuthenticationResource resource, RequestParameters requestParameters);

}