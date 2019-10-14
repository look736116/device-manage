/**
 * 
 */
package com.my.dm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.dm.entity.Student;
import com.my.dm.service.StudentService;

/**
 * @author Rooker
 *
 */

@Controller
@RequestMapping(value = "/student")
public class StudentController {
	@Resource
	StudentService studentService;
	
	@RequestMapping(value = "/test")
	public String test() {
		
		Student student = studentService.getStudentById(1);
		System.out.println(student);
		return "my";
	}

}
