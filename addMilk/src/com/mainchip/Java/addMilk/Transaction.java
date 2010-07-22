/*
 * Transaction.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */

package com.mainchip.Java.addMilk;

public class Transaction {
	private String _id;
	private boolean _undoable;
	
	/**
	 * @param id			The ID associated with this Transaction.
	 * @param undoable		Whether or not the action associated with this Transaction can be undone.
	 */
	public Transaction(String id, String undoable){
		_id = id;
		
		if(undoable == null){
			_undoable = false;
		}else {
			_undoable = (undoable.equals("1"));
		}
	}

	/**
	 * Returns the ID associated with this Transaction.
	 *
	 * @return				The ID associated with this Transaction.
	 */
	public String getID() {
		return _id;
	}

	/**
	 * Indicates whether or not the API call associated with this Transaction can be undone.
	 *
	 * @return				True if the action associated with this Transaction can be undone, false otherwise.
	 */
	public boolean isUndoable() {
		return _undoable;
	}
}
