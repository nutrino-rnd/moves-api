package com.moves.api.impl.dto.summary;

import java.util.Date;


import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.moves.api.impl.response.serialize.MovesDateDeserializer;

public class UserActivitySummary {
    @JsonDeserialize(using = MovesDateDeserializer.class)
    private Date date;
    private ActivitySummary[] summary;
    private int caloriesIdle;

    public Date getDate() {
	return this.date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public ActivitySummary[] getSummary() {
	return this.summary;
    }

    public void setSummary(ActivitySummary[] summary) {
	this.summary = summary;
    }

    public int getCaloriesIdle() {
	return this.caloriesIdle;
    }

    public void setCaloriesIdle(int caloriesIdle) {
	this.caloriesIdle = caloriesIdle;
    }
}
