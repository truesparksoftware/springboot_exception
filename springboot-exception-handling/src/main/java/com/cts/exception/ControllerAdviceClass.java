package com.cts.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;



public class ControllerAdviceClass {

	
	//@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="User Exception Occured")
	@ExceptionHandler(UserNotFound.class)
    public ResponseEntity<ResponseMsg> userNotFound() {
		ResponseMsg res=new ResponseMsg();
		res.setDate(LocalDateTime.now() );
		res.setMessage("User not found");
		res.setUrl("/current path");
		return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmployeeException.class)
    public ResponseEntity<ResponseMsg> employeeNotFound() {
		ResponseMsg res=new ResponseMsg();
		res.setDate(LocalDateTime.now() );
		res.setMessage("Employee not found");
		res.setUrl("/current path");
		return new ResponseEntity<>(res,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
