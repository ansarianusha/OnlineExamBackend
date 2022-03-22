package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import com.lti.entity.Admin;

@Component
public class AdminDao extends GenericDao {

	public int isValiduser2(String email, String password) {
		return (Integer) entityManager
							.createQuery("select a.id from Admin a where a.admin_Mail = :em and a.password = :pw")
							.setParameter("em", email)
							.setParameter("pw", password)
							.getSingleResult();
		
	}

}
