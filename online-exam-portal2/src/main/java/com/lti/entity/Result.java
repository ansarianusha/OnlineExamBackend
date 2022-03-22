package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Result {
	@Id
	@GeneratedValue
	private int result_Id;
	
	private String status;
	private double score;
	private int rlevel;
	
	@ManyToOne
	@JoinColumn(name="exam_Id")
	private Exam exam;
	
	@OneToOne
	@JoinColumn(name="user_Id")
	private Users users;

	public int getResult_Id() {
		return result_Id;
	}

	public void setResult_Id(int result_Id) {
		this.result_Id = result_Id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getRlevel() {
		return rlevel;
	}

	public void setRlevel(int rlevel) {
		this.rlevel = rlevel;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
	

	


}
