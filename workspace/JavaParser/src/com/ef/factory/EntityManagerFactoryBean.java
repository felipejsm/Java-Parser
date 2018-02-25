package com.ef.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryBean {
	private EntityManagerFactory entityManagerFactory;

	public EntityManagerFactoryBean() {
		entityManagerFactory = 	Persistence.createEntityManagerFactory("JavaParser");
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
}
