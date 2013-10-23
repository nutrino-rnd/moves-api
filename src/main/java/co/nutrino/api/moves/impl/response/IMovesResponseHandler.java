package co.nutrino.api.moves.impl.response;



import org.scribe.model.Response;

import co.nutrino.api.moves.exception.ResourceException;


public interface IMovesResponseHandler {

    public <T> T getResponse(Response response, Class<T> c) throws ResourceException;

}