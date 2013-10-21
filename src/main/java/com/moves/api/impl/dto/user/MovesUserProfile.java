package com.moves.api.impl.dto.user;

import java.util.Date;
import java.util.TimeZone;


import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.moves.api.impl.response.serialize.MovesDateDeserializer;
import com.moves.api.impl.response.serialize.MovesTimezoneDeserializer;

public class MovesUserProfile {
    @JsonDeserialize(using = MovesDateDeserializer.class)
    private Date firstDate;
    @JsonDeserialize(using = MovesTimezoneDeserializer.class)
    private TimeZone currentTimeZone;
    private boolean caloriesAvailable;

    public Date getFirstDate() {
	return this.firstDate;
    }

    public void setFirstDate(Date firstDate) {
	this.firstDate = firstDate;
    }

    public TimeZone getCurrentTimeZone() {
	return this.currentTimeZone;
    }

    public void setCurrentTimeZone(TimeZone currentTimeZone) {
	this.currentTimeZone = currentTimeZone;
    }

    public boolean isCaloriesAvailable() {
	return this.caloriesAvailable;
    }

    public void setCaloriesAvailable(boolean caloriesAvailable) {
	this.caloriesAvailable = caloriesAvailable;
    }
}
