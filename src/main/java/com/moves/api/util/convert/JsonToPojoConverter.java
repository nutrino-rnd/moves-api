package com.moves.api.util.convert;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

/**
 * 
 * @author yogev
 * 
 * @param <T>
 */
@Component
public class JsonToPojoConverter implements IJsonToPojoConverter {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T convertSourceToPojo(String json, Class<T> c) throws ConversionException {
	T toReturn = null;
	try {
	    toReturn = mapper.readValue(json, c);
	} catch (JsonParseException e) {
	    throw new ConversionException("Could not parse JSON", e);
	} catch (JsonMappingException e) {
	    throw new ConversionException("Could not map JSON", e);
	} catch (IOException e) {
	    throw new ConversionException("Error while trying to convert JSON", e);
	}

	return toReturn;
    }

    public <T> T[] convertSourceToPojos(String json, Class<T[]> arrayClass) throws ConversionException {
	T[] toReturn = null;
	try {
	    toReturn = mapper.readValue(json, arrayClass);
	} catch (JsonParseException e) {
	    throw new ConversionException("Could not parse JSON", e);
	} catch (JsonMappingException e) {
	    throw new ConversionException("Could not map JSON", e);
	} catch (IOException e) {
	    throw new ConversionException("Error while trying to convert JSON", e);
	}

	return toReturn;
    }
}
