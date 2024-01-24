package com.ltim.postmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.postmapping.entity.UserBean;
import com.ltim.postmapping.service.UserServiceImpl;

@RestController
public class UserController {
    
    @Autowired
    private UserServiceImpl service;

    @GetMapping("/list")
    public List<UserBean> getList(){
        return service.findAll();
    }

    @PostMapping("/save")
    public String save(@RequestBody UserBean user){
        service.save(user);
        return "Data inserted";
    }

    @GetMapping("/getid/{id}")
    public UserBean getByID(@PathVariable int id){
        return service.findOne(id);
    }
    

}
