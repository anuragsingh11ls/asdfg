package com.anu.usermanagement.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.bean.AddressBean;
import com.anu.usermanagement.core.dao.AddressDao;
import com.anu.usermanagement.core.entitys.Address;
import com.anu.usermanagement.service.AddressService;

@Service("addressService")
@Transactional
public class AddressServiceImpl implements AddressService{
	@Autowired
	AddressDao addressDao;

	public void saveAddress(AddressBean addressBean) {
		Address address=new Address();
		BeanUtils.copyProperties(addressBean, address);
		addressDao.saveAddress(address);
		
	}

}
