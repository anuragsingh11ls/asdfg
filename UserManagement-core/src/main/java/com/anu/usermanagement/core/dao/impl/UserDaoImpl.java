package com.anu.usermanagement.core.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.UserDao;
import com.anu.usermanagement.core.entitys.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDaoImpl<User, String> implements UserDao {

    protected UserDaoImpl() {
        super(User.class);
    }

    public void saveUser(User user) {
    	user.setCreatedOn(new Date());
    	System.out.println("ttttt"+user);
        saveOrUpdate(user);
       
    }


	/*@SuppressWarnings("unchecked")
	public List<User> getAllUsers(User user) {
		return this.getCurrentSession().createQuery("from User").list();
	}*/

	public void deleteUser(int id) {
		
		User user = (User) getCurrentSession().load(User.class, id);
        if (null != user) {
		this.getCurrentSession().delete(user);
		
	}
	}

	public List<User> getAll(User user) {
		return findAll();
	}

	//login
	//@Override
	public User getUser(String login) {
		List<User> userList = new ArrayList<User>();
		Query query = getCurrentSession().createQuery("from User u where u.login = :login");
		query.setParameter("login", login);
		userList = query.list();
		if (userList.size() > 0)
			return userList.get(0);
		else
			return null;	
	}
}

