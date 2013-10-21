package com.moves.api.impl.dto.storyline;

import com.moves.api.impl.dto.activity.TrackPoint;

public class MovesPlace {
    private long id;
    private String name;
    private MovesPlaceTypeEnum type;
    private String foursquareId;
    private TrackPoint location;

    public long getId() {
	return this.id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public MovesPlaceTypeEnum getType() {
	return this.type;
    }

    public void setType(MovesPlaceTypeEnum type) {
	this.type = type;
    }

    public String getFoursquareId() {
	return this.foursquareId;
    }

    public void setFoursquareId(String foursquareId) {
	this.foursquareId = foursquareId;
    }

    public TrackPoint getLocation() {
	return this.location;
    }

    public void setLocation(TrackPoint location) {
	this.location = location;
    }
}