/*
 * User.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */

package com.mainchip.Java.addMilk;

/**
 * A wrapper containing information about an RTM User.
 * 
 * @author Dustin Stroup
 */
public class User {
	private String _id, _username, _fullname;
	private Transaction _trans;
	
	/**
	 * @param id			The ID associated with this User.
	 */
	public User(String id){
		_id = id;
	}
	
	/**
	 * @param id			The ID associated with this User.
	 * @param username		This Users username.
	 * @param fullname		This Users full name.
	 */
	public User(String id, String username, String fullname){
		_id = id;
		_username = username;
		_fullname = fullname;
	}

	/**
	 * Returns the ID associated with this User.
	 *
	 * @return				The ID associated with this User.
	 */
	public String getID() {
		return _id;
	}

	/**
	 * Sets this Users username.
	 *
	 * @param username		The username to set.
	 */
	void setUsername(String username) {
		_username = username;
	}

	/**
	 * Returns this Users username.
	 *
	 * @return				This Users username.
	 */
	public String getUsername() {
		return _username;
	}

	/**
	 * Returns this Users full name.
	 *
	 * @return				This Users full name.
	 */
	public String getFullname() {
		return _fullname;
	}
	
	/**
	 * Sets the Transaction associated with the API call that returned this user data.
	 *
	 * @param trans			The Transaction to set.
	 */
	void setTransaction(Transaction trans){
		_trans = trans;
	}
	
	/**
	 * Returns the Transaction associated with the API call that returned this user data.
	 *
	 * @return				The Transaction associated with the API call that returned this user data.
	 */
	public Transaction getTransaction(){
		return _trans;
	}
}
