package com.gsc.demo.service;

import java.util.List;

import com.gsc.demo.domain.Student;

/**
 * @author shichaogeng
 *
 * 2017年9月20日
 */
public interface StudentService {

	List<Student> likeName(String name);

    List<Student> likeNameByDefaultDataSource(String name);
    
    void updateStudent(Student student);
}
