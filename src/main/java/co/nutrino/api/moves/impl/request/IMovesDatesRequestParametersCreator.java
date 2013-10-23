package co.nutrino.api.moves.impl.request;

import java.util.Date;

import co.nutrino.api.moves.request.RequestParameters;




public interface IMovesDatesRequestParametersCreator {

    public RequestParameters createDatesIntervalRequestParameters(Date from, Date to);

    public RequestParameters createPastDaysRequestParameters(int numberOfDays);

}