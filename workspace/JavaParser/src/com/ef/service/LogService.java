package com.ef.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.ef.entity.Log;
import com.ef.factory.EntityManagerFactoryBean;

public class LogService {
	private EntityManagerFactory factory;

	public LogService(EntityManagerFactoryBean factoryBean) {
		this.factory = factoryBean.getEntityManagerFactory();
	}
	public void addLogs (List<Log> logs) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		int counter = 1;
		for(Log log : logs) {
			em.merge(log);
	        if (counter % 50 == 0) {
	            em.flush();
	            em.clear();
	        }
	        counter++;
		}
	    em.getTransaction().commit();
	    em.close();
	}
}
