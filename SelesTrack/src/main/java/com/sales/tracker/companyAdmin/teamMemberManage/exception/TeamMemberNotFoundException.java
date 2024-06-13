package com.sales.tracker.companyAdmin.teamMemberManage.exception;

public class TeamMemberNotFoundException extends RuntimeException{

private String errorMessage;
	
	public TeamMemberNotFoundException(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
