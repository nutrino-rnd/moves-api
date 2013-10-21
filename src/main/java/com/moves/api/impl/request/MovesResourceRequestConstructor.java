package com.moves.api.impl.request;


import org.scribe.model.OAuthRequest;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;
import org.springframework.stereotype.Component;

import com.moves.api.request.RequestParameter;
import com.moves.api.request.RequestParameters;

@Component
public class MovesResourceRequestConstructor implements IMovesResourceRequestConstructor {

    private static final String ResourceUrl = "https://api.moves-app.com/api/v1";

    @Override
    public OAuthRequest constructRequest(OAuthService service, MovesObject object, MovesResource resource, String[] pathParameters,
	    RequestParameters requestParameters) {

	String url = constructRequestUrl(object, resource, pathParameters);
	OAuthRequest request = new OAuthRequest(Verb.GET, url);

	addRequestParameters(requestParameters, request);

	return request;
    }

    private String constructRequestUrl(MovesObject object, MovesResource resource, String[] pathParameters) {
	String url = ResourceUrl + "/" + object + "/" + resource;
	if (pathParameters != null)
	    for (String param : pathParameters)
		url += "/" + param;
	return url;
    }

    private void addRequestParameters(RequestParameters requestParameters, OAuthRequest request) {
	if (requestParameters != null)
	    for (RequestParameter param : requestParameters.getRequestParameters())
		request.addQuerystringParameter(param.getKey(), param.getValue());
    }
}
