package com.sales.tracker.superAdmin.modulesManage.exception;

import org.springframework.http.HttpStatus;

public class ModuleException {
	private final String message;
	private final Throwable throwable;
	private final HttpStatus status;
	
	
	
	public ModuleException(String message, Throwable throwable, HttpStatus status) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	public HttpStatus getStatus() {
		return status;
	}
}
