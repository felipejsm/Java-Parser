package com.ef.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "log_tb")
public class Log implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
}
