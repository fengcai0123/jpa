package com.core.service;

import com.core.entity.User;
import com.core.exception.UserException;
import com.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yonghuo.chen on 16/10/7.
 */
@Service
public class UserServiceImpl  implements UserService {

        @Autowired
        private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User deleteUser(int id) throws UserException {
        User userDelete=userRepository.findOne(id);
        if (userDelete==null)
            throw new UserException();
        if(userDelete!=null){
            userRepository.delete(userDelete);
        }
        return userDelete;

    }

    @Override
    public User updateUser(User user) throws UserException {
        User userUpdate=userRepository.findOne(user.getId());
        System.out.println("传入user.getId()+"+user.getId());
        if(userUpdate==null)
            throw new UserException();
        if(user.getId()!=0){
            System.out.println("传入user.getId()+"+user.getId());
            userUpdate.setId(user.getId());
        }
        if(user.getUsername()!=null){
            System.out.println("传入user.getUsername()+"+user.getUsername());
            userUpdate.setUsername(user.getUsername());
        }
        if(user.getMobile()!=null){
            System.out.println("传入user.getMobile()+"+user.getMobile());
            userUpdate.setMobile(user.getMobile());
        }
        if(user.getNickName()!=null){
            System.out.println("传入user.getNickName()+"+user.getNickName());
            userUpdate.setNickName(user.getNickName());
        }
        userRepository.save(userUpdate);
        return userUpdate;
    }

    @Override
    public User getUser(int id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

      /*  public String add(User user){
            userRepository.save(user);
            return "添加成功！";
        }

        public String addUser(String account){
            User user = new User();
            user.setName(account);
            userRepository.save(user);
            return "添加成功！";
        }

        public User getOneUser(Long id){
            return userRepository.findOne(id);
        }*/

    /* @Transactional(readOnly = true)
        public Page<User> getPage(int pageNo,int pageSize){
            PageRequest pageRequest=new PageRequest(pageNo-1,pageSize);
            System.out.println("-------------"+userRepository.findAll(pageRequest));
            return userRepository.findAll(pageRequest);
        }
    */
//    @Override
//    public List<User> findByUsername(String userName) {
//        return null;
//    }
//
//    @Override
//    public List<User> findAll() {
//        return null;
//    }
//
//    @Override
//    public User findOneByUsername(String username) {
//        User user= userRepository.getByUsername(username);
//        System.out.print("serviceImpl mobile="+user.getMobile());
//        return user;
//    }
}
