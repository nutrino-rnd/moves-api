package co.nutrino.api.moves.impl.dto.storyline;



import org.codehaus.jackson.map.annotate.JsonDeserialize;

import co.nutrino.api.moves.impl.response.serialize.MovesSegmentTypeEnumDeserializer;


@JsonDeserialize(using = MovesSegmentTypeEnumDeserializer.class)
public enum MovesSegmentTypeEnum {
    Move, Place;
}
