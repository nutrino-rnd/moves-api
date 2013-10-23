package co.nutrino.api.moves.impl.response.serialize;

import java.io.IOException;



import org.apache.commons.lang3.text.WordUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import co.nutrino.api.moves.impl.dto.storyline.MovesPlaceTypeEnum;


public class MovesPlaceTypeEnumDeserializer extends JsonDeserializer<MovesPlaceTypeEnum> {

    @Override
    public MovesPlaceTypeEnum deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	ObjectCodec oc = jp.getCodec();
	JsonNode node = oc.readTree(jp);

	return MovesPlaceTypeEnum.valueOf(WordUtils.capitalize(node.asText()));
    }
}
