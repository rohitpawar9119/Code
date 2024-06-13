package com.sales.tracker.superAdmin.departmentManager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class DepartmentHandlerException {
	@ExceptionHandler(value = { DepartmentNotFoundException.class })
	public ResponseEntity<Object> handleEmployee(DepartmentNotFoundException departmentNotFoundException) {
		// create the object of EmployeeException
		DepartmentException employeeException = new DepartmentException(departmentNotFoundException.getMessage(),
				departmentNotFoundException.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
