package com.lti.service;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.dao.AdminDao;
import com.lti.entity.Admin;

import com.lti.exception.AdminServiceException;


@Component
@Transactional
public class AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	public Admin login(Admin admin) {
        try {
            int id=adminDao.isValiduser2(admin.getAdmin_Mail(), admin.getPassword());
            Admin admin1=  adminDao.fetchById(Admin.class, id);
            return admin1;
        }catch(NoResultException e){
            throw new AdminServiceException("Invalid Email/ Password");
        }
    }
	

}
