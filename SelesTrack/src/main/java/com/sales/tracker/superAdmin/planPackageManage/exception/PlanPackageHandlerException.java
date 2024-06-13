package com.sales.tracker.superAdmin.planPackageManage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class PlanPackageHandlerException {
	@ExceptionHandler(value = { PlanPackageNotFoundException.class })
	public ResponseEntity<Object> handleEmployee(PlanPackageNotFoundException planPackageNotFoundException) {
		// create the object of EmployeeException
		PlanPackageException employeeException = new PlanPackageException(planPackageNotFoundException.getMessage(),
				planPackageNotFoundException.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
