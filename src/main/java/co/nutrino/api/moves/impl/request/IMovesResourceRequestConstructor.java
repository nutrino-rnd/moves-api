package co.nutrino.api.moves.impl.request;



import org.scribe.model.OAuthRequest;
import org.scribe.oauth.OAuthService;

import co.nutrino.api.moves.request.RequestParameters;


public interface IMovesResourceRequestConstructor {

    public OAuthRequest constructRequest(OAuthService service, MovesObject object, MovesResource resource, String[] pathParameters,
	    RequestParameters requestParameters);

}