package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue
	private int answerid;
	
	@OneToOne
	@JoinColumn(name="question_Id")
	private Question questions;
	
	@ManyToOne
	@JoinColumn(name="exam_Id")
	private Exam examAns;

	public int getAnswerid() {
		return answerid;
	}

	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}

	public Question getQuestions() {
		return questions;
	}

	public void setQuestions(Question questions) {
		this.questions = questions;
	}

	public Exam getExamAns() {
		return examAns;
	}

	public void setExamAns(Exam examAns) {
		this.examAns = examAns;
	}

	 

}