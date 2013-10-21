package com.moves.api.impl.response.serialize;

import java.util.Calendar;

import junit.framework.TestCase;


import org.junit.Test;

import com.moves.api.impl.response.serialize.MovesDateParser;

public class MovesDateParserTest extends TestCase {
    @Test
    public void test_type() {
	assertNotNull(MovesDateParser.class);
    }

    @Test
    public void test_toDate_ShortDate_ParsesShortDate() throws Exception {

	int year = 2012;
	int month = 11;
	int day = 15;
	String dateString = "" + year + month + day;
	Calendar actual = Calendar.getInstance();
	actual.setTime(MovesDateParser.toDate(dateString));

	assertEquals(day, actual.get(Calendar.DAY_OF_MONTH));
	assertEquals(month - 1, actual.get(Calendar.MONTH));
	assertEquals(year, actual.get(Calendar.YEAR));
    }

    @Test
    public void test_toDate_LongDate_ParsesShortDate() throws Exception {

	int year = 2012;
	int month = 11;
	int day = 15;
	int hour = 16;
	int minute = 12;
	int second = 32;
	String dateString = "" + year + month + day + "T" + hour + minute + second + "Z";
	Calendar actual = Calendar.getInstance();
	actual.setTime(MovesDateParser.toDate(dateString));

	assertEquals(day, actual.get(Calendar.DAY_OF_MONTH));
	assertEquals(month - 1, actual.get(Calendar.MONTH));
	assertEquals(year, actual.get(Calendar.YEAR));
	assertEquals(hour, actual.get(Calendar.HOUR_OF_DAY));
	assertEquals(minute, actual.get(Calendar.MINUTE));
	assertEquals(second, actual.get(Calendar.SECOND));
    }

    @Test
    public void test_toWeekString_Date_WeekString() throws Exception {

	int year = 2012;
	int month = 11;
	int day = 15;
	Calendar date = Calendar.getInstance();
	date.set(Calendar.YEAR, year);
	date.set(Calendar.MONTH, month);
	date.set(Calendar.DAY_OF_MONTH, day);
	String actual = MovesDateParser.toWeekString(date.getTime());

	assertEquals("2012-W50", actual);
    }

    @Test
    public void test_toMonthString_Date_MonthString() throws Exception {

	int year = 2012;
	int month = 11;
	int day = 15;
	Calendar date = Calendar.getInstance();
	date.set(Calendar.YEAR, year);
	date.set(Calendar.MONTH, month);
	date.set(Calendar.DAY_OF_MONTH, day);
	String actual = MovesDateParser.toMonthString(date.getTime());

	assertEquals("201212", actual);
    }
}
