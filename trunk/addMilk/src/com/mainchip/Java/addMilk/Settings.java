/*
 * Settings.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */

package com.mainchip.Java.addMilk;

/**
 * An wrapper containing a Users RTM settings.
 * 
 * @author Dustin Stroup
 */
public class Settings {
	private String _timezone, _defaultList, _language, _dateFormat, _timeFormat;

	/**
	 * Returns the users timezone.
	 *
	 * @return				The users timezone.
	 */
	public String getTimezone() {
		return _timezone;
	}

	/**
	 * Sets the timezone.
	 *
	 * @param timezone		The timezone to set.
	 */
	void setTimezone(String timezone) {
		_timezone = timezone;
	}

	/**
	 * Return the users default list.
	 *
	 * @return				The ID of the default list.
	 */
	public String getDefaultList() {
		return _defaultList;
	}

	/**
	 * Sets the default list.
	 *
	 * @param defaultList	The ID of the default list.
	 */
	void setDefaultList(String defaultList) {
		_defaultList = defaultList;
	}

	/**
	 * Returns the users language.
	 *
	 * @return				The users langauge.
	 */
	public String getLanguage() {
		return _language;
	}

	/**
	 * Returns the users date format.
	 *
	 * @return				The date format.  0 indicates European date format (14/10/2006), 1 indicates American date format (10/14/2006.
	 */
	public String getDateFormat() {
		return _dateFormat;
	}

	/**
	 * Sets the date format.  0 indicates European date format (14/10/2006), 1 indicates American date format (10/14/2006.
	 *
	 * @param dateFormat	The date format to set.
	 */
	void setDateFormat(String dateFormat) {
		_dateFormat = dateFormat;
	}

	/**
	 * Returns the users time format.
	 *
	 * @return				The time format.  0 indicates 12 hour time, 1 indicates 24 hour time.
	 */
	public String getTimeFormat() {
		return _timeFormat;
	}

	/**
	 * Sets the time format.  0 indicates 12 hour time, 1 indicates 24 hour time.
	 *
	 * @param timeFormat	The time format to set.
	 */
	void setTimeFormat(String timeFormat) {
		_timeFormat = timeFormat;
	}
}
