package com.stdnt.stdntmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stdnt.stdntmanager.dto.StudentDto;
import com.stdnt.stdntmanager.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentCtrl {
	
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addStudent(@RequestBody StudentDto stdntDTO) {
		studentService.addStudent(stdntDTO);
		return new ResponseEntity<String>(stdntDTO.getFirstName(), HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody StudentDto stdntDTO) {
//		studentService.addStudent(stdntDTO);
		return new ResponseEntity<String>(stdntDTO.getFirstName(), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<String> getAllStudent() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getStudent() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

}
