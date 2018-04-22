package com.anu.usermanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.bean.RegisterBean;
import com.anu.usermanagement.core.dao.UserDao;
import com.anu.usermanagement.core.entitys.User;
import com.anu.usermanagement.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	
	
	public void saveUser(RegisterBean registerBean) {
		User user=new User();
		BeanUtils.copyProperties(registerBean, user);
		userDao.saveUser(user);

	}
	/*public List<User> getAllEmployees(RegisterBean registerBean) {
		
		User user=new User();
		return userDao.getAllUsers(user);
	}*/
	
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}
	public List<User> getAll(RegisterBean registerBean) {
		User user=new User();
		return userDao.getAll(user);
	}

	//for login
	//@Override
	public User getUser(String login) {
		// TODO Auto-generated method stub
		return userDao.getUser(login);
	}

	/* @Override
    @Transactional(readOnly = false)
    public void deleteUser(String userName) {
        User user = userDao.findById(userName);
        if (user != null) {
            userDao.delete(user);
        }
    }

    @Override
    public List<User> findUsers(String user) {
        return userDao.findUsers(user);
    }*/
}
