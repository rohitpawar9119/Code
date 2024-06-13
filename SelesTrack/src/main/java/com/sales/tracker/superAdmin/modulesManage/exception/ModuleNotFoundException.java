package com.sales.tracker.superAdmin.modulesManage.exception;

public class ModuleNotFoundException extends RuntimeException {

private String errorMessage;
	
	public ModuleNotFoundException(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
