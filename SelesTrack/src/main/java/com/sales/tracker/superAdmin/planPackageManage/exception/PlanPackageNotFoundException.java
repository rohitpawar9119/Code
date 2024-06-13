package com.sales.tracker.superAdmin.planPackageManage.exception;

public class PlanPackageNotFoundException extends RuntimeException {

private String errorMessage;
	
	public PlanPackageNotFoundException(String errorMessage) {
		super(errorMessage);//super class constructor calling
	}
}
