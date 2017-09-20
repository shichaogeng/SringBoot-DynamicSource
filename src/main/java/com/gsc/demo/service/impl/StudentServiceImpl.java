package com.gsc.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsc.demo.datasource.TargetDataSource;
import com.gsc.demo.domain.Student;
import com.gsc.demo.mapper.StudentMapper;
import com.gsc.demo.service.StudentService;

/**
 * @author shichaogeng
 *
 * 2017年9月20日
 */
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	/**
	 * @author shichaogeng
	 * @date 2017年9月20日
	 * @param name
	 * @return
	 */
	@Override
	@TargetDataSource(name="ds1")
	public List<Student> likeName(String name) {
		return studentMapper.likeName(name);
	}

	/**
	 * @author shichaogeng
	 * @date 2017年9月20日
	 * @param name
	 * @return
	 */
	@Override
	public List<Student> likeNameByDefaultDataSource(String name) {
		return studentMapper.likeNameByDefaultDataSource(name);
	}

	/**
	 * @author shichaogeng
	 * @date 2017年9月20日
	 * @param id
	 */
	@Override
	public void updateStudent(Student student) {
		studentMapper.updateStudent(student);
	}

}
