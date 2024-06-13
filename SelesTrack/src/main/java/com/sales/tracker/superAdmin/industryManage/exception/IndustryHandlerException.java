package com.sales.tracker.superAdmin.industryManage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class IndustryHandlerException {
	@ExceptionHandler(value = { IndustryNotFoundException.class })
	public ResponseEntity<Object> handleEmployee(IndustryNotFoundException industryNotFoundException) {
		// create the object of EmployeeException
	IndustryException employeeException = new IndustryException(industryNotFoundException.getMessage(),
			industryNotFoundException.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
