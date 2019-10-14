/**
 * 
 */
package com.my.dm.dao.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.my.dm.dao.StudentDao;
import com.my.dm.entity.Student;

/**
 * @author Rooker
 *
 */
@Repository(value = "studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public Student getStudentById(int stuId) {
		// TODO Auto-generated method stub
		System.out.println(stuId);
		Session session = sessionFactory.getCurrentSession();
		Student student = (Student) session.get(Student.class, stuId);
		return student;
	}

}
