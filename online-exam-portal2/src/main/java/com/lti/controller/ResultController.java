package com.lti.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Result;
import com.lti.entity.Users;
import com.lti.service.ResultService;

@RestController
@CrossOrigin
public class ResultController {
	
	@Autowired
	private ResultService resultService;
	
	@RequestMapping("/reportcard{result_Id}")
	public List<Users> getReportcard(@PathVariable(name = "result_Id") int rid)
	{
		return resultService.getReportcard(rid);
	}
	
	@RequestMapping("/reportcardbyname{exam_Name}")
	public List<Users> getReportcardByExam(@PathVariable(name = "exam_Name") String eid)
	{
		return resultService.getReportcardByExam(eid);
	}
	
	@RequestMapping("/reportcardbydate{exam_Date}")
	public List<Users> getReportcardByDate(@PathVariable(name = "exam_Date")@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateofexam)
	{
		return resultService.getReportcardByDate(dateofexam);
	}
	
	@GetMapping("/getallreportcard")
	public List<Object> getAllReportcard()
	{
		return resultService. getAllReportcard();
	}

	

}
