package com.anu.usermanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.bean.CountryBean;
import com.anu.usermanagement.core.dao.CountryDao;
import com.anu.usermanagement.core.entitys.Country;
import com.anu.usermanagement.service.CountryService;
@Service("countryService")
@Transactional
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	private CountryDao countryDao;
	//private Country country=new Country();
	public List<Country> getAll() 
	{
		return countryDao.getAll();
	}

}
