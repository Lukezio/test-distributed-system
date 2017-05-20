package de.lm.ttt.usermanagement;

public class UserAlreadyLoggedInException extends Exception{
	
	  public UserAlreadyLoggedInException() {
	  }

	  public UserAlreadyLoggedInException(final String message) {
	    super(message);
	  }

	  public UserAlreadyLoggedInException(final String message, final Throwable cause) {
	    super(message, cause);
	  }

	  public UserAlreadyLoggedInException(final Throwable cause) {
	    super(cause);
	  }

}
