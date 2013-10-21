package com.moves.api.impl.request;


import org.scribe.model.OAuthRequest;
import org.scribe.oauth.OAuthService;

import com.moves.api.request.RequestParameters;

public interface IMovesResourceRequestConstructor {

    public OAuthRequest constructRequest(OAuthService service, MovesObject object, MovesResource resource, String[] pathParameters,
	    RequestParameters requestParameters);

}