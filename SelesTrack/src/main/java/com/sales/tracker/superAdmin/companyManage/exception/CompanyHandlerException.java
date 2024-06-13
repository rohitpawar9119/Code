package com.sales.tracker.superAdmin.companyManage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class CompanyHandlerException {
	@ExceptionHandler(value = { CompanyNotFoundException.class })
	public ResponseEntity<Object> handleEmployee(CompanyNotFoundException companyNotFoundException) {
		// create the object of EmployeeException
		CompanyException employeeException = new CompanyException(companyNotFoundException.getMessage(),
				companyNotFoundException.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
