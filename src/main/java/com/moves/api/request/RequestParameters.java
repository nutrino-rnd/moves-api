package com.moves.api.request;

import java.util.List;

public class RequestParameters {
    private List<RequestParameter> requestParameters;

    public RequestParameters(List<RequestParameter> requestParameters) {
	this.requestParameters = requestParameters;
    }

    public List<RequestParameter> getRequestParameters() {
	return requestParameters;
    }
}
