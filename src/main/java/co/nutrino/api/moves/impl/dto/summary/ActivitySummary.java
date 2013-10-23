package co.nutrino.api.moves.impl.dto.summary;

import co.nutrino.api.moves.impl.dto.activity.MovesActivityEnum;

public class ActivitySummary {
    private MovesActivityEnum activity;
    private int duration;
    private int distance;
    private int steps;
    private int calories;

    public MovesActivityEnum getActivity() {
	return this.activity;
    }

    public void setActivity(MovesActivityEnum activity) {
	this.activity = activity;
    }

    public int getDuration() {
	return this.duration;
    }

    public void setDuration(int duration) {
	this.duration = duration;
    }

    public int getDistance() {
	return this.distance;
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
}
