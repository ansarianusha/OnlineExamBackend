package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Users {
	
	@Id
	@GeneratedValue
	private int user_Id;
	
	private String user_Name;
	
	@Column(unique = true)
	private String user_Mail;
	
	@Column(unique = true)
	private long mobile_No;
	
	private String address;
	private LocalDate dob;
	private String password;
	
	@OneToMany(mappedBy="user")
	List<Subject> subjects;
	
	@OneToMany(mappedBy="users")
	List<Exam> exam;

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getUser_Mail() {
		return user_Mail;
	}

	public void setUser_Mail(String user_Mail) {
		this.user_Mail = user_Mail;
	}

	public long getMobile_No() {
		return mobile_No;
	}

	public void setMobile_No(long mobile_No) {
		this.mobile_No = mobile_No;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
	
	
	

	

}
