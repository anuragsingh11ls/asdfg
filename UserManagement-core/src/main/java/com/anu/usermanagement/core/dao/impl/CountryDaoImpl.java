package com.anu.usermanagement.core.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.CountryDao;
import com.anu.usermanagement.core.entitys.Country;
@Repository("countryDao")
public class CountryDaoImpl extends AbstractDaoImpl<Country, String> implements CountryDao{

	protected CountryDaoImpl() {
		super(Country.class);
		// TODO Auto-generated constructor stub
	}

	public List<Country> getAll() {
		// TODO Auto-generated method stub
		return findAll();
	}

}
