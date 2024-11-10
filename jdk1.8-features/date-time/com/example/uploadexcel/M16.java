package com.example.uploadexcel;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class M16 {
	public static void main(String[] args) {
		// LocalDate/LocalTime <-> LocalDateTime
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTimeFromDateAndTime = LocalDateTime.of(date, time);
		LocalDate dateFromDateTime = LocalDateTime.now().toLocalDate();
		LocalTime timeFromDateTime = LocalDateTime.now().toLocalTime();
		// Instant <-> LocalDateTime
		Instant instant = Instant.now();
		LocalDateTime dateTimeFromInstant = LocalDateTime.ofInstant(instant, ZoneId.of("America/Los_Angeles"));
		Instant instantFromDateTime = LocalDateTime.now().toInstant(ZoneOffset.ofHours(-2));
		// convert old date/calendar/timezone classes
		Instant instantFromDate = new Date().toInstant();
		Instant instantFromCalendar = Calendar.getInstance().toInstant();
		ZoneId zoneId = TimeZone.getDefault().toZoneId();
		ZonedDateTime zonedDateTimeFromGregorianCalendar = new GregorianCalendar().toZonedDateTime();
		// convert to old classes
		Date dateFromInstant = Date.from(Instant.now());
		TimeZone timeZone = TimeZone.getTimeZone(ZoneId.of("America/Los_Angeles"));
		GregorianCalendar gregorianCalendar = GregorianCalendar.from(ZonedDateTime.now());		
	}
}
