/*
 * Rrule.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */

package com.mainchip.Java.addMilk;

import com.mainchip.Java.addMilk.RTM.Freq;

/**
 * An wrapper containing the information about an RTM Recurrence Rule.
 * 
 * @author Dustin Stroup
 */
public class Rrule {
	private boolean _recType;
	private Freq _recFreq;
	private int _interval;
	
	/**
	 * @param recType	The recurrence type of this rule.	
	 * @param recFreq	The recurrence frequency of this rule.
	 * @param interval	The recurrence interval of this rule.
	 */
	public Rrule(boolean recType, Freq recFreq, int interval) {
		_recType = recType;
		_recFreq = recFreq;
		_interval = interval;
	}
	
	/**
	 * @param recType	The recurrence type of this rule.
	 */
	public Rrule(String recType) {
		if(recType.equals("0")){
			_recType = false;
		}else {
			_recType = true;
		}
	}
	
	/**
	 * Returns the recurrence type.
	 * 
	 * @return 			The recurrence type of this rule.  False if the rule 
	 * 					repeats always, True if the rule 'every'.
	 */
	public boolean getRecType() {
		return _recType;
	}
	
	/**
	 * Returns the recurrence frequency.
	 * 
	 * @return 			The recurrence frequency of this rule.
	 */
	public Freq getRecFreq() {
		return _recFreq;
	}
	
	/**
	 * Sets the recurrence frequency.
	 * 
	 * @param recFreq 	The recurrence frequency to set.
	 */
	public void setRecFreq(Freq recFreq) {
		_recFreq = recFreq;
	}
	
	/**
	 * Returns the interal of recurrence.
	 * 
	 * @return 			The interval of recurrence.
	 */
	public int getInterval() {
		return _interval;
	}
	
	/**
	 * Sets the interval of recurrence.
	 * 
	 * @param interval	The interval to set.
	 */
	public void setInterval(int interval) {
		_interval = interval;
	}
}
