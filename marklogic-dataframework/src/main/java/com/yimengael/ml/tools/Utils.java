package com.yimengael.ml.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import com.yimengael.ml.exceptions.TechnicalException;

public class Utils {

	/**
	 * 
	 */
	private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.FRANCE);
	
	/**
	 * 
	 */
	public static Date infinitedate;
	
	static {
		try {
			infinitedate = SIMPLE_DATE_FORMAT.parse("9999-12-31T23:59:59Z");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public static Date getTodayDate() {
		return new Date();
	}
	
	public static String toMarkLogicDateFormat(final Date date) throws TechnicalException {
		return SIMPLE_DATE_FORMAT.format(date);
	}
	
	public static Date parseDate(final String date) throws TechnicalException {
		try {
			return SIMPLE_DATE_FORMAT.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new TechnicalException("Error when parsing date", e);
		}
	}
	
	
	/**
	 * 
	 */
	public static String createUniqueID() {
		return UUID.randomUUID().toString();
	}
}
