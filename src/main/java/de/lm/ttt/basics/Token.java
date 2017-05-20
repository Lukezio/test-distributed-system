package de.lm.ttt.basics;

public class Token {

	private String token;

	public Token() {
		token = "none";
	}

	public Token(String token) {
		this.token = token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Token token1 = (Token) o;
		return getToken().equals(token1.getToken());
	}

}
