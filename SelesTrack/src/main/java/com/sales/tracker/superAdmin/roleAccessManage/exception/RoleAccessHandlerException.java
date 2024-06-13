package com.sales.tracker.superAdmin.roleAccessManage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class RoleAccessHandlerException {
	@ExceptionHandler(value = { RoleAccessNotFoundExcception.class })
	public ResponseEntity<Object> handleEmployee(RoleAccessNotFoundExcception roleAccessNotFoundExcception) {
		// create the object of EmployeeException
		RoleAccessException employeeException = new RoleAccessException (roleAccessNotFoundExcception.getMessage(),
				roleAccessNotFoundExcception.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
