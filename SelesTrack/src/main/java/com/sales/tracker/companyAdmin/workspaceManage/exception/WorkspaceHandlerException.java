package com.sales.tracker.companyAdmin.workspaceManage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class WorkspaceHandlerException {
	@ExceptionHandler(value = { WorkspaceNotFoundException.class })
	public ResponseEntity<Object> handleEmployee(WorkspaceNotFoundException workspaceNotFoundException) {
		// create the object of EmployeeException
		WorkspaceException employeeException = new WorkspaceException(workspaceNotFoundException.getMessage(),
				workspaceNotFoundException.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
