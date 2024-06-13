package com.sales.tracker.superAdmin.roleAccessManage.exception;

public class RoleAccessNotFoundExcception extends RuntimeException{

private String errorMessage;
	
	public RoleAccessNotFoundExcception(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
