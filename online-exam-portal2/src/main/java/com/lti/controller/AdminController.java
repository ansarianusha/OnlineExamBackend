package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.AdminLoginStatus;
import com.lti.entity.Admin;
import com.lti.exception.AdminServiceException;
import com.lti.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminService  adminService;
	
	
	@RequestMapping("/adminlogin.api")
	public AdminLoginStatus login(@RequestBody Admin admin){
		try {
			Admin admin1= adminService.login(admin);
			AdminLoginStatus loginStatus=new AdminLoginStatus();
			loginStatus.setStatus(true);
			loginStatus.setAdminId(admin1.getAdmin_Id());
			return loginStatus;
			
		}catch(AdminServiceException e) {
			AdminLoginStatus loginStatus=new AdminLoginStatus();
			loginStatus.setStatus(false);
			loginStatus.setMessageIfAny(e.getMessage());
			return loginStatus;
			
		}
	}	

}
