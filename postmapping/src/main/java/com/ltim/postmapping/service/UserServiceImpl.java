package com.ltim.postmapping.service;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ltim.postmapping.entity.UserBean;
@Service
public class UserServiceImpl implements UserService {
    private static List<UserBean> users = new ArrayList<>();
    public static int userCount = 5;

    static{
        users.add(new UserBean(1, "John", new Date()));
        users.add(new UserBean(2, "Robert", new Date()));
        users.add(new UserBean(3, "Adam", new Date()));
        users.add(new UserBean(4,"Ashish", new Date()));
        users.add(new UserBean(5, "Jigar", new Date()));
    }

    @Override
    public List<UserBean> findAll() {
        return users;
    }

    @Override
    public UserBean save(UserBean user) {
        if(user.getId() == null){
            //increments the user id
           user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    @Override
    public UserBean findOne(int id) {
        
        for(UserBean u : users){
            if(u.getId() == id){
                return u;
            }
        }
        return null;
    }
    
}
