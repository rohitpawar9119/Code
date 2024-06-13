package com.sales.tracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SalesHandlerException {
	@ExceptionHandler(value = { SalesNotFoundException.class })
	public ResponseEntity<Object> handleEmployee(SalesNotFoundException salesNotFoundException) {
		// create the object of EmployeeException
		SalesException employeeException = new SalesException(salesNotFoundException.getMessage(),
				salesNotFoundException.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
