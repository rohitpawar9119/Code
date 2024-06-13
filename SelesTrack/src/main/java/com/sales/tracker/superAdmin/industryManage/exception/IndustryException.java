package com.sales.tracker.superAdmin.industryManage.exception;

import org.springframework.http.HttpStatus;

public class IndustryException {
	private final String message;
	private final Throwable throwable;
	private final HttpStatus status;
	
	
	
	public IndustryException(String message, Throwable throwable, HttpStatus status) {
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
