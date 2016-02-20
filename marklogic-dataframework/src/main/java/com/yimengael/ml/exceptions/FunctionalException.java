package com.yimengael.ml.exceptions;

public class FunctionalException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public FunctionalException(final String message) {
		super(message);
	}
	
	/**
	 * 
	 */
	public FunctionalException(final Exception e){
		super(e);
	}
	
	/**
	 * 
	 */
	public FunctionalException(final String message, final Exception e){
		super(message, e);
	}
}
