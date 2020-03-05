package com.stdnt.stdntmanager.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stdnt.stdntmanager.conf.StudentConf;
import com.stdnt.stdntmanager.dto.StudentDto;
import com.stdnt.stdntmanager.model.Student;

@Service
public class StudentService {
	
	static Logger log = Logger.getLogger(StudentService.class.getName());
	
	@Autowired
	StudentConf stdntConf;
	
	public void addStudent(StudentDto stdntDTO) {
		Student student = stdntConf.getObjectMapper().convertValue(stdntDTO, Student.class);
		System.out.println(student.getFirstName());
	}

}
