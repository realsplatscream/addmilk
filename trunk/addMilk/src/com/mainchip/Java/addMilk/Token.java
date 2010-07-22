/*
 * Token.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */

package com.mainchip.Java.addMilk;

/**
 * A wrapper containing information about an RTM Token.
 * 
 * @author Dustin Stroup
 */
public class Token {
	private String _token, _perms;
	private User _user;
	
	/**
	 * @param token			The token string.
	 */
	public Token(String token){
		_token = token;
	}
	
	/**
	 * Returns the Token string.
	 *
	 * @return				The Token string.
	 */
	public String getToken() {
		return _token;
	}
	
	/**
	 * Returns the permissions granted through this Token.
	 *
	 * @return				The permissions granted through this Token.
	 */
	public String getPerms() {
		return _perms;
	}
	
	/**
	 * Sets the permissions granted via this Token.
	 *
	 * @param perms			The permissions granted via this Token.
	 */
	void setPerms(String perms) {
		_perms = perms;
	}
	
	/**
	 * Returns the user associated with this Token.
	 *
	 * @return				The user associated with this Token.
	 */
	public User getUser() {
		return _user;
	}
	
	/**
	 * Sets the user associated with this Token.
	 *
	 * @param user			The user to set.
	 */
	void setUser(User user) {
		_user = user;
	}
}
