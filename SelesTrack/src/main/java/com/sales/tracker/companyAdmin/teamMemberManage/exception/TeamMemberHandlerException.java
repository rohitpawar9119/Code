package com.sales.tracker.companyAdmin.teamMemberManage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class TeamMemberHandlerException {
	@ExceptionHandler(value = { TeamMemberNotFoundException.class })
	public ResponseEntity<Object> handleEmployee(TeamMemberNotFoundException teamMemberNotFoundException) {
		// create the object of EmployeeException
		TeamMemberException employeeException = new TeamMemberException(teamMemberNotFoundException.getMessage(),
				teamMemberNotFoundException.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
	}
}
