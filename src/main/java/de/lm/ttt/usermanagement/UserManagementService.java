package de.lm.ttt.usermanagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.lm.ttt.basics.IllegalParameterException;
import de.lm.ttt.basics.InvalidTokenException;
import de.lm.ttt.basics.ServiceNotAvailableException;
import de.lm.ttt.basics.Token;
import de.lm.ttt.basics.TokenFactory;

public class UserManagementService implements IUserManagementService {
	
	private static final org.slf4j.Logger logger =
	          org.slf4j.LoggerFactory.getLogger(UserManagementService.class);

	private Map<Token, User> users;
	private Map<String, User> userByName;
	private static TokenFactory tokenFactory;

	public UserManagementService() {
		users = new HashMap<Token, User>();
		tokenFactory = new TokenFactory();
	}

	private void assumeTokenValid(Token userToken) throws InvalidTokenException, IllegalParameterException {
		assertThatIsNotNull(userToken);
		if (!users.containsKey(userToken)) {
			throw new InvalidTokenException("This token is not valid");
		}
	}

	private void assertThatIsNotNull(Token userToken) throws IllegalParameterException {
		if (userToken == null) {
			throw new IllegalParameterException("Reference for token is a null reference.");
		}
	}	

	private void assumeUserAlreadyRegistered(String name) throws IllegalParameterException, UserNotFoundException{
		if (name == null) {
			throw new IllegalParameterException("String for name is null reference.");
		}
		if (name.trim().length() == 0) {
			throw new IllegalParameterException("String for name does only contain whitespaces.");
		}
		if (!userByName.containsKey(name)) {
			throw new UserNotFoundException(name + " is not registered yet!");
		}
	}

	@Override
	public Token register(String name)
			throws ServiceNotAvailableException, IllegalParameterException, UserAlreadyExistsException {
		if (name == null) {
			throw new IllegalParameterException("String for name is null reference.");
		}
		if (name.trim().length() == 0) {
			throw new IllegalParameterException("String for name does only contain whitespaces.");
		}
		Token userToken = new Token();
		userToken.setToken(tokenFactory.createToken(userToken));
		User user = new User(userToken, name);
		users.put(userToken, user);
		userByName.put(name, user);
		return userToken;
	}

	@Override
	public Token login(String name)
			throws ServiceNotAvailableException, IllegalParameterException, UserNotFoundException {
		assumeUserAlreadyRegistered(name);
		User user = userByName.get(name);
		return user.getToken();
	}

	@Override
	public User resolveUser(Token userToken) throws ServiceNotAvailableException, IllegalParameterException,
			InvalidTokenException {
		assumeTokenValid(userToken);
		return users.get(userToken);
	}

	@Override
	public List<User> getAllUsers(Token userToken) throws ServiceNotAvailableException, IllegalParameterException, InvalidTokenException {
		assumeTokenValid(userToken);
		List<User> list = new ArrayList<User>();
		Collection<User> c = users.values();
		list.addAll(c);
		return list;
	}

	@Override
	public User getUser(Token requestingUser, String requestedUser)
			throws ServiceNotAvailableException, IllegalParameterException, UserNotFoundException, InvalidTokenException {
		assumeTokenValid(requestingUser);
		assumeUserAlreadyRegistered(requestedUser);
		return userByName.get(requestedUser);
	}

}
