package de.lm.ttt.basics;

import java.util.UUID;

public class TokenFactory implements ITokenFactory{

	@Override
	public String createToken(Object object) {
		return UUID.randomUUID() + object.toString() +System.nanoTime();		
	}

}
