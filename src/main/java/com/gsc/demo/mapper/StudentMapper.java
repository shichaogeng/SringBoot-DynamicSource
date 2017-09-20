package com.gsc.demo.mapper;

import java.util.List;

import com.gsc.demo.domain.Student;

/**
 * @author shichaogeng
 *
 * 2017年9月20日
 */
public interface StudentMapper {

	List<Student> likeName(String name);

    List<Student> likeNameByDefaultDataSource(String name);
    
    void updateStudent(Student student);
}
