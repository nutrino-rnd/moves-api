package com.moves.api.request;

public class RequestParameter {
    private String key;
    private String value;
    private RequestParameterType paramType;

    public RequestParameter(String key, String value) {
	this(key, value, RequestParameterType.String);
    }

    public RequestParameter(String key, long value) {
	this(key, String.valueOf(value), RequestParameterType.Integer);
    }

    private RequestParameter(String key, String value, RequestParameterType paramType) {
	this.key = key;
	this.value = value;
	this.paramType = paramType;
    }

    public String getKey() {
	return this.key;
    }

    public String getValue() {
	return this.value;
    }

    public RequestParameterType getParameterType() {
	return this.paramType;
    }
}
