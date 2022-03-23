package com.lti.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Users;
import com.lti.dao.ResultDao;

@Component
@Transactional
public class ResultService {
	
	@Autowired
	ResultDao resultDao;
	
	public List<Users> getReportcard(int rid)
	{
		return resultDao.getReportcardByUserId(rid);
	}
	
	public List<Users> getReportcardByExam(String eid)
	{
		return resultDao.getReportcardByExam(eid);
	}
	
	public List<Users> getReportcardByDate(LocalDate dateofexam)
	{
		return resultDao.getReportcardByDate(dateofexam);
	}
	
	public List<Object>  getAllReportcard()
	{
		return resultDao. getAllReportcard();
	}



}
