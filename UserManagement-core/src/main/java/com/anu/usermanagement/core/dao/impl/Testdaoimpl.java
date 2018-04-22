package com.anu.usermanagement.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.TestDao;


@Repository("testdao")
public class Testdaoimpl implements TestDao{
	
	
	

	public String add() {
	String s="am in add core";
	return s;
		
	}

}
