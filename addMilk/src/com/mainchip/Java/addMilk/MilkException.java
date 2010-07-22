/*
 * MilkException.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */

package com.mainchip.Java.addMilk;

/**
 * A general API error.
 * 
 * @author Dustin Stroup
 */
public class MilkException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4536538743313930521L;

	public MilkException(String message){
		super(message);
	}
	
	public MilkException(String message, Throwable cause){
		super(message, cause);
	}
}
