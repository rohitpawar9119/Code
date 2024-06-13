package com.sales.tracker.superAdmin.companySizeManage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class CompanySizeMangeHandlerException {
	@ExceptionHandler(value = { CompanySizeMangeNotFoundException.class })
	public ResponseEntity<Object> handleEmployee(CompanySizeMangeNotFoundException companySizeMangeNotFoundException) {
		// create the object of EmployeeException
		CompanySizeMangeException employeeException = new CompanySizeMangeException(companySizeMangeNotFoundException.getMessage(),
				companySizeMangeNotFoundException.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
