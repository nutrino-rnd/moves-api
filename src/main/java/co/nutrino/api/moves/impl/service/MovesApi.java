package co.nutrino.api.moves.impl.service;

import org.scribe.builder.api.DefaultApi20;
import org.scribe.model.OAuthConfig;
import org.springframework.stereotype.Component;

@Component
public class MovesApi extends DefaultApi20 implements IMovesApi {

    @Override
    public String getAccessTokenEndpoint() {
	return "https://api.moves-app.com/oauth/v1/access_token";
    }

    @Override
    public String getAuthorizationUrl(OAuthConfig config) {
	return "https://api.moves-app.com/oauth/v1/authorize";
    }

}
