package com.gsc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsc.demo.config.StudentConstants;
import com.gsc.demo.domain.Student;

/**
 * @author shichaogeng
 *
 * 2017年9月22日
 */
@RestController
public class StudentController {
	
	@Autowired
	private StudentConstants studentConstants;

	@RequestMapping("/getStudent")
	public Student getStudent() {
		Student student = new Student();
		student.setName(studentConstants.getName());
		student.setAge(studentConstants.getAge());
		return student;
	}
}
