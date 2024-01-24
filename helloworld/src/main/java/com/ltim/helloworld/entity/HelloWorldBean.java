package com.ltim.helloworld.entity;

public class HelloWorldBean {
    private String message;


    public HelloWorldBean(String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        return "HelloWorldBean [message=" + message + "]";
    }

    
    public int sum(int a , int b){
        return a+b;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
