package com.anu.usermanagement.core.dao.impl;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.AddressDao;
import com.anu.usermanagement.core.entitys.Address;

@Repository("addressDao")
public class AddressDaoImpl extends AbstractDaoImpl<Address, String> implements AddressDao{
	protected AddressDaoImpl() {
        super(Address.class);
    }

	public void saveAddress(Address address) {
		address.setCreatedOn(new Date());
		saveOrUpdate(address);
		
	}

	

	
}
