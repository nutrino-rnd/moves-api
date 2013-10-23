package co.nutrino.api.moves.impl.dto.activity;

import java.util.Date;



import org.codehaus.jackson.map.annotate.JsonDeserialize;

import co.nutrino.api.moves.impl.response.serialize.MovesDateDeserializer;


public class TrackPoint {
    private float lat;
    private float lon;
    @JsonDeserialize(using = MovesDateDeserializer.class)
    private Date timestamp;

    public float getLat() {
	return this.lat;
    }

    public void setLat(float lat) {
	this.lat = lat;
    }

    public float getLon() {
	return this.lon;
    }

    public void setLon(float lon) {
	this.lon = lon;
    }

    public Date getTimestamp() {
	return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
    }
}