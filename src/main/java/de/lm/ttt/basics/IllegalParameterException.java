package de.lm.ttt.basics;

public class IllegalParameterException extends Exception {

	public IllegalParameterException() {
	}

	public IllegalParameterException(final String message) {
		super(message);
	}

	public IllegalParameterException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public IllegalParameterException(final Throwable cause) {
		super(cause);
	}
}
