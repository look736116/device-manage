package com.my.dm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements  Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5614903948116613242L;

	@Id 
	@Column(name = "STU_ID")
	private int stuId;

	@Column(name ="STU_NAME")
	private String  stuName;
	
	

	/**
	 * 
	 */
	public Student() {
		super();
	}



	/**
	 * @param stuId
	 * @param stuName
	 */
	public Student(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}



	/**
	 * @return the stuId
	 */
	public int getStuId() {
		return stuId;
	}



	/**
	 * @param stuId the stuId to set
	 */
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}



	/**
	 * @return the stuName
	 */
	public String getStuName() {
		return stuName;
	}



	/**
	 * @param stuName the stuName to set
	 */
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}



	@Override
	public String toString() {
		return "Test [stuId=" + stuId + ", stuName=" + stuName + "]";
	}
	
	
	
	
	
}
