package com.fast.core;

public class AutoError extends RuntimeException {
	
	public String error="";
	
	public AutoError(String errorDescription) {
		super(errorDescription);
	}

	public AutoError(String errorName, String errorDescription) {
		super(errorDescription);
		this.error = error;
	}

}
