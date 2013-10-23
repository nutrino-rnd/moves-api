package co.nutrino.api.moves.impl.dto.storyline;



import org.codehaus.jackson.map.annotate.JsonDeserialize;

import co.nutrino.api.moves.impl.response.serialize.MovesPlaceTypeEnumDeserializer;


@JsonDeserialize(using = MovesPlaceTypeEnumDeserializer.class)
public enum MovesPlaceTypeEnum {
    Unknown, School, Work, User, Foursquare
}