package com.sales.tracker.companyAdmin.workspaceManage.exception;

public class WorkspaceNotFoundException  extends RuntimeException{

private String errorMessage;
	
	public WorkspaceNotFoundException(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
