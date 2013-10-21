package com.moves.api.impl.request;

import java.util.Date;

import com.moves.api.request.RequestParameters;


public interface IMovesDatesRequestParametersCreator {

    public RequestParameters createDatesIntervalRequestParameters(Date from, Date to);

    public RequestParameters createPastDaysRequestParameters(int numberOfDays);

}