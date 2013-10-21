package com.moves.api.impl.response;


import org.scribe.model.Response;

import com.moves.api.exception.ResourceException;

public interface IMovesResponseHandler {

    public <T> T getResponse(Response response, Class<T> c) throws ResourceException;

}