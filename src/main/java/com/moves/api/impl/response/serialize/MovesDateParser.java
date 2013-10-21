package com.moves.api.impl.response.serialize;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MovesDateParser {

    private static final SimpleDateFormat ShortFormat = new SimpleDateFormat("yyyyMMdd");
    private static final SimpleDateFormat LongFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");

    private static final SimpleDateFormat WeekFormat = new SimpleDateFormat("yyyy-'W'ww");
    private static final DateFormat MonthFormat = new SimpleDateFormat("yyyyMM");

    public static Date toDate(String dateString) throws ParseException {
	return dateString.contains("T") ? LongFormat.parse(dateString) : ShortFormat.parse(dateString);
    }

    public static String toShortString(Date date) {
	return ShortFormat.format(date);
    }

    public static String toLongString(Date date) {
	return LongFormat.format(date);
    }

    public static String toWeekString(Date date) {
	return WeekFormat.format(date);
    }

    public static String toMonthString(Date date) {
	return MonthFormat.format(date);
    }
}
