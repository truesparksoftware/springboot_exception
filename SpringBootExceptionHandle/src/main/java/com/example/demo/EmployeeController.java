package com.example.demo;

import java.io.File;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.BadStudent;

import com.example.demo.exception.StudentExceptionDemo;

@RestController
@RequestMapping("/st")
public class EmployeeController {

	
	@GetMapping("/get/{id}")
	public String getStudent(@PathVariable String id){
		
		int number=20;
		
		int res=number/0;
		System.out.println(res);
		
		
		
		if(id.equals("abc")) {
			throw new StudentExceptionDemo("student not found");
		}
		
		if(id.equals("xyz")) {
			throw new BadStudent();
		}
		
		
		return id;
	}
}
