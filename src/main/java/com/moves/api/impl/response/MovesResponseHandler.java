package com.moves.api.impl.response;

import org.scribe.model.Response;
import org.springframework.stereotype.Component;

import com.moves.api.exception.ResourceException;
import com.moves.api.util.convert.ConversionException;
import com.moves.api.util.convert.IJsonToPojoConverter;
import com.moves.api.util.convert.JsonToPojoConverter;

@Component
public class MovesResponseHandler implements IMovesResponseHandler {

    private IJsonToPojoConverter converter = new JsonToPojoConverter();

    @Override
    public <T> T getResponse(Response response, Class<T> c) throws ResourceException {
	if (response.getCode() != 200)
	    throw new ResourceException("Request failed with status - " + response.getCode());
	try {
	    return this.converter.convertSourceToPojo(response.getBody(), c);
	} catch (ConversionException e) {
	    throw new ResourceException("Parsing response failed - " + e);
	}
    }
}
