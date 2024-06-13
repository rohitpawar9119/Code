package com.sales.tracker.superAdmin.modulesManage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ModuleHandlerException {
	@ExceptionHandler(value = { ModuleNotFoundException.class })
	public ResponseEntity<Object> handleEmployee(ModuleNotFoundException moduleNotFoundException) {
		// create the object of EmployeeException
		ModuleException employeeException = new ModuleException(moduleNotFoundException.getMessage(),
				moduleNotFoundException.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
