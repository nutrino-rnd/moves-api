package com.moves.api.impl.dto.storyline;


import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.moves.api.impl.response.serialize.MovesSegmentTypeEnumDeserializer;

@JsonDeserialize(using = MovesSegmentTypeEnumDeserializer.class)
public enum MovesSegmentTypeEnum {
    Move, Place;
}
