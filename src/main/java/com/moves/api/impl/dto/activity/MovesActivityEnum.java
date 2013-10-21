package com.moves.api.impl.dto.activity;


import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.moves.api.impl.response.serialize.MovesActivityEnumDeserializer;

@JsonDeserialize(using = MovesActivityEnumDeserializer.class)
public enum MovesActivityEnum {
    Walking("wlk"), Running("run"), Cycling("cyc");

    private String label;

    private MovesActivityEnum(String label) {
	this.label = label;
    }

    public String getLabel() {
	return this.label;
    }
}
