package com.cts;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.exception.EmployeeException;
import com.cts.exception.UserNotFound;

@RestController
@RequestMapping("/controller")
public class ControllerClass {

	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable String id){
		if(id.equals("abc")) {
			throw new UserNotFound();
		}
		return null;
	}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<?> getEmployee(@PathVariable String id){
		if(id.equals("xyz")) {
			throw new EmployeeException();
		}
		return null;
	}
}
