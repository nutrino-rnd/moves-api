package co.nutrino.api.moves.impl.client;

public class MovesUserCredentials implements IMoveUserCredentials {
    private String token;
    private String refreshToken;

    public MovesUserCredentials(String token, String refreshToken) {
	this.token = token;
	this.refreshToken = refreshToken;
    }

    @Override
    public String getToken() {
	return this.token;
    }

    @Override
    public String getRefreshToken() {
	return this.refreshToken;
    }

}
