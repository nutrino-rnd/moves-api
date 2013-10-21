package com.moves.api.impl.service;

import javax.inject.Inject;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.SignatureType;
import org.scribe.oauth.OAuthService;
import org.springframework.stereotype.Component;

@Component
public class MovesServiceBuilder implements IMovesServiceBuilder {
    private IMovesApi api;
    private IMovesSecurityManager securityManager;

    @Inject
    public MovesServiceBuilder(IMovesApi api, IMovesSecurityManager securityManager) {
	this.api = api;
	this.securityManager = securityManager;
    }

    @Override
    public OAuthService buildService() {
	OAuthService service = new ServiceBuilder().provider(this.api.getClass()).apiKey(this.securityManager.getKey())
		.apiSecret(this.securityManager.getSecret()).signatureType(SignatureType.QueryString).build();
	return service;
    }
}
