package co.nutrino.api.moves.impl.service;

import javax.inject.Inject;



import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;
import org.springframework.stereotype.Component;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.request.IMovesAuthenticationRequestConstructor;
import co.nutrino.api.moves.impl.request.IMovesResourceRequestConstructor;
import co.nutrino.api.moves.impl.request.MovesAuthenticationResource;
import co.nutrino.api.moves.impl.request.MovesObject;
import co.nutrino.api.moves.impl.request.MovesResource;
import co.nutrino.api.moves.impl.response.IMovesResponseHandler;
import co.nutrino.api.moves.request.IAuthToken;
import co.nutrino.api.moves.request.RequestParameters;


@Component
public class MovesOAuthService implements IMovesOAuthService {

    private OAuthService service;

    private IMovesResponseHandler responseHandler;
    private IMovesResourceRequestConstructor resourceRequestConstructor;
    private IMovesAuthenticationRequestConstructor authenticationRequestConstructor;

    @Inject
    public MovesOAuthService(IMovesServiceBuilder serviceBuilder, IMovesResponseHandler responseHandler,
	    IMovesResourceRequestConstructor resourceRequestConstructor, IMovesAuthenticationRequestConstructor authenticationRequestConstructor) {
	this.authenticationRequestConstructor = authenticationRequestConstructor;
	this.service = serviceBuilder.buildService();
	this.responseHandler = responseHandler;
	this.resourceRequestConstructor = resourceRequestConstructor;
    }

    @Override
    public <T> T getProtectedResource(MovesObject object, MovesResource resource, String[] pathParameters, RequestParameters requestParameters,
	    IAuthToken token, Class<T> c) throws ResourceException, OAuthException {
	OAuthRequest request = this.resourceRequestConstructor.constructRequest(service, object, resource, pathParameters, requestParameters);
	return sendRequest(token, request, c);
    }

    @Override
    public <T> T getAuthenticationResource(MovesAuthenticationResource resource, RequestParameters requestParameters, IAuthToken token, Class<T> c)
	    throws ResourceException {
	OAuthRequest request = this.authenticationRequestConstructor.constructRequest(Verb.GET, resource, requestParameters);
	return sendRequest(token, request, c);
    }

    @Override
    public <T> T postAuthenticationResource(MovesAuthenticationResource resource, RequestParameters requestParameters, IAuthToken token, Class<T> c)
	    throws ResourceException {
	OAuthRequest request = this.authenticationRequestConstructor.constructRequest(Verb.POST, resource, requestParameters);
	return sendRequest(token, request, c);
    }

    private <T> T sendRequest(IAuthToken token, OAuthRequest request, Class<T> c) throws ResourceException {
	Token requestToken = new Token(token.getToken(), token.getSecret());

	this.service.signRequest(requestToken, request);

	Response response = request.send();
	return this.responseHandler.getResponse(response, c);
    }
}
