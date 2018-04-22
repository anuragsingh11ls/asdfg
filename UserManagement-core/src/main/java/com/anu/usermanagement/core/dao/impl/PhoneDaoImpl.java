package com.anu.usermanagement.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.PhoneDao;
import com.anu.usermanagement.core.entitys.Phone;

@Repository("phoneDao")
public class PhoneDaoImpl extends AbstractDaoImpl<Phone, String> implements PhoneDao{

	protected PhoneDaoImpl() {
		super(Phone.class);
		// TODO Auto-generated constructor stub
	}

	public void savePhone(Phone phone) {
		saveOrUpdate(phone);
		
	}

}
