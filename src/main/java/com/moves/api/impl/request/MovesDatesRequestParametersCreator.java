package com.moves.api.impl.request;

import java.util.Arrays;
import java.util.Date;


import org.springframework.stereotype.Component;

import com.moves.api.impl.response.serialize.MovesDateParser;
import com.moves.api.request.RequestParameter;
import com.moves.api.request.RequestParameters;

@Component
public class MovesDatesRequestParametersCreator implements IMovesDatesRequestParametersCreator {

    @Override
    public RequestParameters createDatesIntervalRequestParameters(Date from, Date to) {
	RequestParameter parameterFrom = new RequestParameter("from", MovesDateParser.toShortString(from));
	RequestParameter parameterTo = new RequestParameter("to", MovesDateParser.toShortString(to));
	return new RequestParameters(Arrays.asList(new RequestParameter[] { parameterFrom, parameterTo }));
    }

    @Override
    public RequestParameters createPastDaysRequestParameters(int numberOfDays) {
	RequestParameter pastDays = new RequestParameter("pastDays", numberOfDays);
	return new RequestParameters(Arrays.asList(new RequestParameter[] { pastDays, }));
    }

}
