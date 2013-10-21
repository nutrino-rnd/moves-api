package com.moves.api.impl.response.serialize;

import java.io.IOException;


import org.apache.commons.lang3.text.WordUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import com.moves.api.impl.dto.storyline.MovesSegmentTypeEnum;

public class MovesSegmentTypeEnumDeserializer extends JsonDeserializer<MovesSegmentTypeEnum> {

    @Override
    public MovesSegmentTypeEnum deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	ObjectCodec oc = jp.getCodec();
	JsonNode node = oc.readTree(jp);

	return MovesSegmentTypeEnum.valueOf(WordUtils.capitalize(node.asText()));
    }
}
