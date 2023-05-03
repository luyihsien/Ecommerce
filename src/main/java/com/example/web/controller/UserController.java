package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @GetMapping("/Hello")
    public String sayHello(){
        return  "index1";
    }
}


class Person {
    private int age;
    private String name;
    private boolean gender;

    public Person(int age, String name, boolean gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String display() {
        System.out.println("Age: " + getAge());
        System.out.println("Name: "+getName());
        System.out.println("Gender: "+isGender());
        return "Age: " + getAge()+" Name: "+getName()+" Gender: "+isGender();
    }
}


