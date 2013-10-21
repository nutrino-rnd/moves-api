package com.moves.api.impl.dto.authentication;

public class UserMovesAuthentication {

    private String client_id;
    private String user_id;

    private String access_token;
    private String token_type;
    private String scope;
    private String expires_in;
    private String refresh_token;

    public String getClient_id() {
	return this.client_id;
    }

    public void setClient_id(String client_id) {
	this.client_id = client_id;
    }

    public String getUser_id() {
	return this.user_id;
    }

    public void setUser_id(String user_id) {
	this.user_id = user_id;
    }

    public String getAccess_token() {
	return this.access_token;
    }

    public void setAccess_token(String access_token) {
	this.access_token = access_token;
    }

    public String getToken_type() {
	return this.token_type;
    }

    public void setToken_type(String token_type) {
	this.token_type = token_type;
    }

    public String getScope() {
	return this.scope;
    }

    public void setScope(String scope) {
	this.scope = scope;
    }

    public String getExpires_in() {
	return this.expires_in;
    }

    public void setExpires_in(String expires_in) {
	this.expires_in = expires_in;
    }

    public String getRefresh_token() {
	return this.refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
	this.refresh_token = refresh_token;
    }
}
