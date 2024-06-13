package com.sales.tracker.superAdmin.industryManage.exception;

public class IndustryNotFoundException extends RuntimeException{

private String errorMessage;
	
	public IndustryNotFoundException(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
