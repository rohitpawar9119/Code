package com.sales.tracker.superAdmin.departmentManager.exception;

public class DepartmentNotFoundException extends RuntimeException {

private String errorMessage;
	
	public DepartmentNotFoundException(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
