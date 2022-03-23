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
	private int levels;
	
	@ManyToOne
	@JoinColumn(name="exam_Id")
	private Exam examsResult;
	
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

	public int getLevels() {
		return levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}

	public Exam getExamsResult() {
		return examsResult;
	}

	public void setExamsResult(Exam examsResult) {
		this.examsResult = examsResult;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
	



}