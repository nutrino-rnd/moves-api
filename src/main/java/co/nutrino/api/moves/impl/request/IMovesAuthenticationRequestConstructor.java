package co.nutrino.api.moves.impl.request;



import org.scribe.model.OAuthRequest;
import org.scribe.model.Verb;

import co.nutrino.api.moves.request.RequestParameters;


public interface IMovesAuthenticationRequestConstructor {

    public OAuthRequest constructRequest(Verb verb, MovesAuthenticationResource resource, RequestParameters requestParameters);

}