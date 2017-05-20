package de.lm.ttt.basics;

public class ServiceNotAvailableException extends Exception{
	
	public ServiceNotAvailableException() {
	}

	public ServiceNotAvailableException(final String message) {
		super(message);
	}

	public ServiceNotAvailableException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ServiceNotAvailableException(final Throwable cause) {
		super(cause);
	}
}
