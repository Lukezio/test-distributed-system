package de.lm.ttt.usermanagement;

import de.lm.ttt.basics.Token;

public class User {
	
	private Token token;
	private String name;
	
	public User() {
		
	}
	
	public User(Token token, String name) {
		this.token = token;
		this.name = name;
	}
	
	public User(Token token) {
		this.token = token;
	}
	
	public void setToken(Token token) {
		this.token = token;
	}
	
	public Token getToken() {
		return token;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
