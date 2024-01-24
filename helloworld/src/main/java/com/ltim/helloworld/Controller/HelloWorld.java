package com.ltim.helloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.helloworld.entity.HelloWorldBean;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/show")
public class HelloWorld {

    @GetMapping("/hello")
    public String display()
    {
        return "Welcome to SpringBoot Project";
    }

    @GetMapping("/bean")
    public HelloWorldBean bean()
    {
        return new HelloWorldBean("Hello Bean Bhai");
    }
    @GetMapping("/path/bean/{name}")
    public HelloWorldBean show(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
    @GetMapping("/home/{n1}/{n2}")
    public int sum(@PathVariable int n1, @PathVariable int n2){
        return (n1 + n2);
    }
    
}
