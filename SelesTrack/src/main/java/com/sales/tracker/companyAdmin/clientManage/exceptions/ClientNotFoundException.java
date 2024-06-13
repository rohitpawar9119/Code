package com.sales.tracker.companyAdmin.clientManage.exceptions;

public class ClientNotFoundException extends RuntimeException {

private String errorMessage;
	
	public ClientNotFoundException(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
