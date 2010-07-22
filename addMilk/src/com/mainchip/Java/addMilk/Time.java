/*
 * Time.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */

package com.mainchip.Java.addMilk;

/**
 * A wrapper containing the information used in RTM Time.
 * @author Dustin Stroup
 */
public class Time {
	private String _precision, _time, _timezone;
	
	public Time(){
	}
	
	/**
	 * @param precision		The precision of this timestamp.
	 * @param timezone		The timezone for this timestamp.
	 */
	public Time(String precision, String timezone){
		_precision = precision;
		_timezone = timezone;
	}

	/**
	 * Indicates the precision of this timestamp.
	 *
	 * @return				The precision of this timestamp ("time" or "date").
	 */
	public String getPrecision() {
		return _precision;
	}

	/**
	 * Returns the timestamp.
	 *
	 * @return				The timestamp.
	 */
	public String getTime() {
		return _time;
	}

	/**
	 * Sets the timestamp.
	 *
	 * @param time			The timestamp to set.
	 */
	void setTime(String time) {
		_time = time;
	}

	/**
	 * Returns the timezone for this timestamp.
	 *
	 * @return				The timezone for this timestamp.
	 */
	public String getTimezone() {
		return _timezone;
	}
}
