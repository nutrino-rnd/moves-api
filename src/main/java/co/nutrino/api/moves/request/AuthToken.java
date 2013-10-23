package co.nutrino.api.moves.request;

public class AuthToken implements IAuthToken {

    private String token;
    private String secret;
    private String rawResponse;

    public AuthToken(String token, String secret, String rawResponse) {
	this.token = token;
	this.secret = secret;
	this.rawResponse = rawResponse;
    }

    @Override
    public String getToken() {
	return token;
    }

    @Override
    public String getSecret() {
	return secret;
    }

    @Override
    public String getRawResponse() {
	return rawResponse;
    }
}
