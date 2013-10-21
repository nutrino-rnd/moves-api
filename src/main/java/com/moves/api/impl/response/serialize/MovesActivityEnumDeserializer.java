package com.moves.api.impl.response.serialize;

import java.io.IOException;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import com.moves.api.impl.dto.activity.MovesActivityEnum;

public class MovesActivityEnumDeserializer extends JsonDeserializer<MovesActivityEnum> {
    private static final MovesActivityEnum[] Activities = MovesActivityEnum.values();

    @Override
    public MovesActivityEnum deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	ObjectCodec oc = jp.getCodec();
	JsonNode node = oc.readTree(jp);

	return fromLabel(node.asText());
    }

    private MovesActivityEnum fromLabel(String label) {
	for (MovesActivityEnum activity : Activities)
	    if (activity.getLabel().equals(label))
		return activity;

	throw new IllegalArgumentException("Unknown Moves Activity label " + label);
    }
}
