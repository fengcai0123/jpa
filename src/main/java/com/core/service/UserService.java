package com.core.service;

import com.core.entity.User;
import com.core.exception.UserException;

import java.util.List;

/**
 * Created by yonghuo.chen on 16/10/7.
 */
public interface UserService {
    public void addUser(User user);
    public User deleteUser(int id) throws UserException;
    public User updateUser(User user) throws UserException;
    public User getUser(int id);
    public List<User> findAll();
    /*public List<User> findByUsername(String userName);
    public List<User> findAll();
    public  User findOneByUsername(String username);*/
}
