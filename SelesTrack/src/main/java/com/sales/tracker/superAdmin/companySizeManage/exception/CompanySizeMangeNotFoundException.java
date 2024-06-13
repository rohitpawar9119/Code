package com.sales.tracker.superAdmin.companySizeManage.exception;

public class CompanySizeMangeNotFoundException extends RuntimeException {

private String errorMessage;
	
	public CompanySizeMangeNotFoundException(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
