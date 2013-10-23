package co.nutrino.api.moves.impl.service;

import org.scribe.oauth.OAuthService;

public interface IMovesServiceBuilder {

    public OAuthService buildService();

}