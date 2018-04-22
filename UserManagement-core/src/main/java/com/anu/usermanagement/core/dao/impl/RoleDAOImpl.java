package com.anu.usermanagement.core.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.RoleDAO;
import com.anu.usermanagement.core.entitys.Role;


@Repository
public class RoleDAOImpl extends AbstractDaoImpl<Role, Serializable>implements RoleDAO {
	
	 protected RoleDAOImpl() {
	        super(Role.class);
	    }

	public Role getRole(int id) {
		Role role = (Role) getCurrentSession().load(Role.class, id);
		return role;
	}

}
