package de.lm.ttt.basics;

public class InvalidTokenException extends Exception {
	
	public InvalidTokenException() {
	}

	public InvalidTokenException(final String message) {
		super(message);
	}

	public InvalidTokenException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public InvalidTokenException(final Throwable cause) {
		super(cause);
	}
}
