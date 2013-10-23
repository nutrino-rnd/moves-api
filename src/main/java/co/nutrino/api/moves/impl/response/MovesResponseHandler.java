package co.nutrino.api.moves.impl.response;


import org.scribe.model.Response;
import org.springframework.stereotype.Component;

import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.util.convert.ConversionException;
import co.nutrino.api.moves.util.convert.IJsonToPojoConverter;
import co.nutrino.api.moves.util.convert.JsonToPojoConverter;


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
