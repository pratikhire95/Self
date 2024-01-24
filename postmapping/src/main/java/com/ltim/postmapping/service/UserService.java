package com.ltim.postmapping.service;

import java.util.List;

import com.ltim.postmapping.entity.UserBean;

public interface UserService {
    public List<UserBean> findAll();
    public UserBean save(UserBean user);
    public UserBean findOne(int id);

}
