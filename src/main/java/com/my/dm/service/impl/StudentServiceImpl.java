/**
 * 
 */
package com.my.dm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.dm.dao.StudentDao;
import com.my.dm.entity.Student;
import com.my.dm.service.StudentService;

/**
 * @author Rooker
 *
 */

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

	@Resource
	StudentDao studentDao;
	@Override
	public Student getStudentById(int stuId) {
		// TODO Auto-generated method stub
		return studentDao.getStudentById(stuId);
	}

}
