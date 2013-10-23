package co.nutrino.api.moves.impl.response.serialize;

import java.io.IOException;
import java.util.TimeZone;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class MovesTimezoneDeserializer extends JsonDeserializer<TimeZone> {

    @Override
    public TimeZone deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	ObjectCodec oc = jp.getCodec();
	JsonNode node = oc.readTree(jp);

	return TimeZone.getTimeZone(node.findValue("id").asText());
    }
}
