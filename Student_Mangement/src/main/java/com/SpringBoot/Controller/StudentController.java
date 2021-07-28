package com.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
}
