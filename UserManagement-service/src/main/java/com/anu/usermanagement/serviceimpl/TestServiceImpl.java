package com.anu.usermanagement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.anu.usermanagement.core.dao.TestDao;
import com.anu.usermanagement.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService{
	@Autowired
	public TestDao testDao;

	public String Play() {
		String S1=testDao.add();
		System.out.println("am in ply");
		return S1;
	}

}
