package com.sales.tracker.companyAdmin.clientManage.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ClientHandlerException {

	@ExceptionHandler(value = { ClientNotFoundException.class })
	public ResponseEntity<Object> handleEmployee(ClientNotFoundException clientNotFoundException) {
		// create the object of EmployeeException
		ClientException employeeException = new ClientException(clientNotFoundException.getMessage(),
				clientNotFoundException.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
