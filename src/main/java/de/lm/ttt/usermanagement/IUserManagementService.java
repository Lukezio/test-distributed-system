package de.lm.ttt.usermanagement;

import java.util.List;

import de.lm.ttt.basics.IllegalParameterException;
import de.lm.ttt.basics.InvalidTokenException;
import de.lm.ttt.basics.ServiceNotAvailableException;
import de.lm.ttt.basics.Token;

public interface IUserManagementService {
	
	public Token register(String name) throws ServiceNotAvailableException, IllegalParameterException, UserAlreadyExistsException;
	
	public Token login(String name) throws ServiceNotAvailableException, IllegalParameterException, UserNotFoundException;
	
	public User resolveUser(Token user) throws ServiceNotAvailableException, IllegalParameterException, InvalidTokenException;
	
	public List<User> getAllUsers(Token user) throws ServiceNotAvailableException, IllegalParameterException, InvalidTokenException;
	
	public User getUser(Token requestingUser, String requestedUser) throws ServiceNotAvailableException, IllegalParameterException, UserNotFoundException, InvalidTokenException;

}
