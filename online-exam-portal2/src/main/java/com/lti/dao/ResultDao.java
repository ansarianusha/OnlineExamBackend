package com.lti.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.entity.Users;

@Component
public class ResultDao extends GenericDao{
	
	@Autowired
	EntityManager entityManager;
	
	public List<Users> getReportcardByUserId(int rid)
	{
		Query qry = entityManager.createQuery("select r.result_Id,u.user_Id, u.user_Name, r.score, r.status,r.levels,r.examsResult.exam_Name,r.examsResult.exam_Date from Users u inner join Result r on u.user_Id = r.users.user_Id inner join Exam e on e.exam_Id = r.examsResult.exam_Id where u.user_Id = :u");
				qry.setParameter("u",rid);
		return qry.getResultList();
	}
	
	public List<Users> getReportcardByExam(String eid)
	{
		Query qry = entityManager.createQuery("select r.result_Id,u.user_Id, u.user_Name, r.score, r.status,r.levels,r.examsResult.exam_Name,r.examsResult.exam_Date  from Users u inner join Result r on u.user_Id = r.users.user_Id inner join Exam e on e.exam_Id = r.examsResult.exam_Id where e.exam_Name = :u");
				qry.setParameter("u",eid);
		return qry.getResultList();
	}
	
	public List<Users> getReportcardByDate(LocalDate dateofexam)
	{
		Query qry = entityManager.createQuery("select r.result_Id,u.user_Id,u.user_Name, r.score, r.status,r.levels,r.examsResult.exam_Name,r.examsResult.exam_Date  from Users u inner join Result r on u.user_Id = r.users.user_Id inner join Exam e on e.exam_Id = r.examsResult.exam_Id where e.exam_Date = :u");
				qry.setParameter("u",dateofexam);
		return qry.getResultList();
	}
	
	public List<Object> getAllReportcard()
	{
		Query qry = entityManager.createQuery("select r.result_Id, u.user_Id, u.user_Name, r.score, r.status, r.levels, r.examsResult.exam_Name,r.examsResult.exam_Date from Users u inner join Result r on  u.user_Id = r.users.user_Id");
		return qry.getResultList();
	}


}
