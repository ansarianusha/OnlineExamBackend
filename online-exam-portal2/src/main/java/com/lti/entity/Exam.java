package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Exam {
	
	@Id
	@GeneratedValue
	private int exam_Id;
	
	private String exam_Name;
	private int level;
	private LocalDate exam_Date;
	
	@ManyToOne
	@JoinColumn(name="user_Id")
	private Users users;
	
	@OneToMany(mappedBy="exam")
	List<Subject> subject;
	
	@OneToMany(mappedBy="exams")
	List<Answer> answers;
	
	@OneToMany(mappedBy="exam")
	List<Result> results;

	public int getExam_Id() {
		return exam_Id;
	}

	public void setExam_Id(int exam_Id) {
		this.exam_Id = exam_Id;
	}

	public String getExam_Name() {
		return exam_Name;
	}

	public void setExam_Name(String exam_Name) {
		this.exam_Name = exam_Name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public LocalDate getExam_Date() {
		return exam_Date;
	}

	public void setExam_Date(LocalDate exam_Date) {
		this.exam_Date = exam_Date;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	
}
