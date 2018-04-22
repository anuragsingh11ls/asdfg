package com.anu.usermanagement.core.dao;

import java.util.List;

import com.anu.usermanagement.core.entitys.User;

public interface UserDao extends AbstractDao<User, String> {
    void saveUser(User user);
      
    //public List<User> getAllUsers(User user);
    
    public List<User> getAll(User user);
    public void deleteUser(int id);
    
    //login
    public User getUser(String login);
}
