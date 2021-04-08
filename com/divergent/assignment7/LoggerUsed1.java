package com.divergent.assignment7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUsed1 {

	private final static Logger LOGGER = Logger.getLogger(LoggerUsed1.class.getName());
	public static void main(String[] args) { 
		LOGGER.setLevel(Level.FINE);
		LOGGER.fine("Hello, this is a Logger");
		LOGGER.log(Level.FINE, "Fine Level Of Logger");
	}

}
