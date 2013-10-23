package co.nutrino.api.moves.impl.request;



import org.scribe.model.OAuthRequest;
import org.scribe.model.Verb;
import org.springframework.stereotype.Component;

import co.nutrino.api.moves.request.RequestParameter;
import co.nutrino.api.moves.request.RequestParameters;


@Component
public class MovesAuthenticationRequestConstructor implements IMovesAuthenticationRequestConstructor {

    private static final String ResourceUrl = "https://api.moves-app.com/oauth/v1";

    @Override
    public OAuthRequest constructRequest(Verb verb, MovesAuthenticationResource resource, RequestParameters requestParameters) {
	String url = ResourceUrl + "/" + resource;
	OAuthRequest request = new OAuthRequest(verb, url);

	addRequestParameters(requestParameters, request);

	return request;
    }

    private void addRequestParameters(RequestParameters requestParameters, OAuthRequest request) {
	if (requestParameters != null)
	    for (RequestParameter param : requestParameters.getRequestParameters())
		request.addQuerystringParameter(param.getKey(), param.getValue());
    }
}
