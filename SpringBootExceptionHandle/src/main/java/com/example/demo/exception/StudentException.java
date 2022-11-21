package com.example.demo.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentException {

	@ExceptionHandler(StudentExceptionDemo.class)
	public ResponseEntity<ExceptionMessage> studentExceptionCode() {

		ExceptionMessage ex = new ExceptionMessage();
		ex.setLocalDateTime(LocalDateTime.now());
		ex.setMessage("Student not found...");
		return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(BadStudent.class)
	public ResponseEntity<ExceptionMessage> badStudent() {

		ExceptionMessage ex = new ExceptionMessage();
		ex.setLocalDateTime(LocalDateTime.now());
		ex.setMessage("Student record is not good");
		return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);
	}
}
