package com.fn.ex10;

public class InvalidFunctionNameException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 157464535242L;
	
	public InvalidFunctionNameException(String errorName) {
		super(" Function "+ errorName + "doesn't exist");
	}
}
