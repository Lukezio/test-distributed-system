package de.lm.ttt.usermanagement;

public class UserNotFoundException extends Exception {
	
	  public UserNotFoundException() {
	  }

	  public UserNotFoundException(final String message) {
	    super(message);
	  }

	  public UserNotFoundException(final String message, final Throwable cause) {
	    super(message, cause);
	  }

	  public UserNotFoundException(final Throwable cause) {
	    super(cause);
	  }
}
