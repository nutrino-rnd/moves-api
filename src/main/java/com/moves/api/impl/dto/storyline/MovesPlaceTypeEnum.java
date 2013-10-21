package com.moves.api.impl.dto.storyline;


import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.moves.api.impl.response.serialize.MovesPlaceTypeEnumDeserializer;

@JsonDeserialize(using = MovesPlaceTypeEnumDeserializer.class)
public enum MovesPlaceTypeEnum {
    Unknown, School, Work, User, Foursquare
}