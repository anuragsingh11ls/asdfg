package com.anu.usermanagement.service;

import java.util.List;

import com.anu.usermanagement.bean.RegisterBean;
import com.anu.usermanagement.core.entitys.User;

public interface UserService {

	
    void saveUser(RegisterBean registerBean);
    //public List<User> getAllEmployees(RegisterBean registerBean);
    public void deleteUser(int id);
    
    public List<User> getAll(RegisterBean registerBean);
    
    //login
    public User getUser(String login);
    
   // void deleteUser(String userName);
  
}
