package com.ltim.postmapping.entity;
import java.util.Date;
public class UserBean {
    private Integer id;
    private String name;
    private Date dob;

    public UserBean(){

    }
    public UserBean(Integer id, String name, Date dob){
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
}
