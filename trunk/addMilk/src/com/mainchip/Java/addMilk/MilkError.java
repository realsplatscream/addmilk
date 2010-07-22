/*
 * MilkError.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */

package com.mainchip.Java.addMilk;

/**
 * A wrapper class for errors returned by the RTM API.
 * 
 * @author Dustin Stroup
 */
public class MilkError {
	private String _code, _msg;
	
	/**
	 * @param code		The error code provided by RTM.
	 * @param message	The error message provided by RTM.
	 */
	public MilkError(String code, String message){
		_code = code;
		_msg = message;
	}
	
	/**
	 * Returns the error code provided by RTM.
	 * 
	 * @return			The error code provided by RTM.
	 */
	public String getCode() {
		return _code;
	}
	
	/**
	 * Returns the error message provided by RTM.
	 * 
	 * @return			The error message provided by RTM.
	 */
	public String getMsg() {
		return _msg;
	}
}
