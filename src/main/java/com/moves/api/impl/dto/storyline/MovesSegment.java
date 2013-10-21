package com.moves.api.impl.dto.storyline;

import java.util.Date;


import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.moves.api.impl.dto.activity.MovesActivity;
import com.moves.api.impl.response.serialize.MovesDateDeserializer;

public class MovesSegment {
    private MovesSegmentTypeEnum type;

    @JsonDeserialize(using = MovesDateDeserializer.class)
    private Date startTime;
    @JsonDeserialize(using = MovesDateDeserializer.class)
    private Date endTime;
    private MovesPlace place;
    private MovesActivity[] activities;

    public MovesSegmentTypeEnum getType() {
	return this.type;
    }

    public void setType(MovesSegmentTypeEnum type) {
	this.type = type;
    }

    public Date getStartTime() {
	return this.startTime;
    }

    public void setStartTime(Date startTime) {
	this.startTime = startTime;
    }

    public Date getEndTime() {
	return this.endTime;
    }

    public void setEndTime(Date endTime) {
	this.endTime = endTime;
    }

    public MovesPlace getPlace() {
	return this.place;
    }

    public void setPlace(MovesPlace place) {
	this.place = place;
    }

    public MovesActivity[] getActivities() {
	return this.activities;
    }

    public void setActivities(MovesActivity[] activities) {
	this.activities = activities;
    }
}
