package com.sales.tracker.exception;

public class SalesNotFoundException extends RuntimeException {

private String errorMessage;
	
	public SalesNotFoundException(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
