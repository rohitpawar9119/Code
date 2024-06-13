package com.sales.tracker.superAdmin.companyManage.exception;

public class CompanyNotFoundException extends RuntimeException{

private String errorMessage;
	
	public CompanyNotFoundException(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
