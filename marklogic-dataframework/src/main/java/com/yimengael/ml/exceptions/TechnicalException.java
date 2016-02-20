package com.yimengael.ml.exceptions;

public class TechnicalException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public TechnicalException(final String message) {
		super(message);
	}
	
	/**
	 * 
	 */
	public TechnicalException(final Exception e){
		super(e);
	}
	
	/**
	 * 
	 */
	public TechnicalException(final String message, final Exception e){
		super(message, e);
	}
}
