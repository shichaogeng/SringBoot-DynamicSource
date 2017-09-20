package com.gsc.demo.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.gsc.demo.DemoApplication;
import com.gsc.demo.domain.Student;
import com.gsc.demo.mapper.StudentMapper;
import com.gsc.demo.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=DemoApplication.class)
@WebAppConfiguration
public class MybatisTest {
    private static final Logger logger = LoggerFactory.getLogger(MybatisTest.class);
    
    @Autowired
    StudentService studentService;
    
    @Test
    public void test1() {
    	List<Student> students = studentService.likeName("张");
    	for (Student student : students) {
			System.err.println(student);
		}
    }
    
}
