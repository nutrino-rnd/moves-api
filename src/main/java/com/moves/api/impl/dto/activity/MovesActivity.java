package com.moves.api.impl.dto.activity;

import java.util.Date;


import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.moves.api.impl.response.serialize.MovesDateDeserializer;

public class MovesActivity {
    private MovesActivityEnum activity;

    @JsonDeserialize(using = MovesDateDeserializer.class)
    private Date startTime;
    @JsonDeserialize(using = MovesDateDeserializer.class)
    private Date endTime;
    private int duration;
    private int distance;
    private int steps;
    private int calories;
    private TrackPoint[] trackPoints;

    public MovesActivityEnum getActivity() {
	return this.activity;
    }

    public void setActivity(MovesActivityEnum activity) {
	this.activity = activity;
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

    public int getDuration() {
	return this.duration;
    }

    public int getDistance() {
	return this.distance;
    }

    public void setDuration(int duration) {
	this.duration = duration;
    }

    public void setDistance(int distance) {
	this.distance = distance;
    }

    public int getSteps() {
	return this.steps;
    }

    public void setSteps(int steps) {
	this.steps = steps;
    }

    public int getCalories() {
	return this.calories;
    }

    public void setCalories(int calories) {
	this.calories = calories;
    }

    public TrackPoint[] getTrackPoints() {
	return this.trackPoints;
    }

    public void setTrackPoints(TrackPoint[] trackPoints) {
	this.trackPoints = trackPoints;
    }
}