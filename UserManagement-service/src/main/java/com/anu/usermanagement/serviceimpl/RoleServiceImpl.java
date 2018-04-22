package com.anu.usermanagement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.core.dao.RoleDAO;
import com.anu.usermanagement.core.entitys.Role;
import com.anu.usermanagement.service.RoleService;



@Service
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDAO roleDAO;

	public Role getRole(int id) {
		return roleDAO.getRole(id);
	}

}
