package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1 {

    @RequestMapping("/hi")
    public String message(){
        return "Hey, I have learnt the whole of java and spring boot";
    }

    @RequestMapping("/hello")
    public String msg(){
        return "Where have you been these days?";
    }

    @RequestMapping("/number")
    public int type(){
        return 45;
    }

    @RequestMapping("/salary")
    public double checkSalary(){
        return 365412.570;
    }

    @RequestMapping("/add")
    public String addition(){
        int a=45;
        int b=56;
        int c=a+b;
        return "addition is "+c;
    }

    @RequestMapping("/addition")
    public int add(){
        int a=74;
        int b=25;
        int c=a+b;
        return c;
    }

    @RequestMapping("/subtraction")
    public String subtract(){
        int a=89;
        int b=65;
        int c=a-b;
        return "subtraction is "+c;
    }

    @RequestMapping("/subtract")
    public int subtraction(){
        int a=91;
        int b=73;
        int c=a-b;
        return c;
    }

    @RequestMapping("/multiplication")
    public String multiply(){
        int a=5;
        int b=4;
        int c=a*b;
        return "multiplication is: "+c;
    }

    @RequestMapping("/hello/{name}")
    public String mesaage1(@PathVariable String name){
        return "Welcome to Path Variable"+name;
    }

    @RequestMapping("/msg/{city}")
    public String hello(@PathVariable String city){
        return "Welcome to city of joy"+city;
    }


    @RequestMapping("/solo/{city_name}")
    public String trip(@PathVariable String city_name){
        return "Hey! Are you going to "+city_name;
    }


    @RequestMapping("/your_salary/{salary}")
    public String checkSalary(@PathVariable int salary){
        if (salary>100000){
            return "Your package is high";
        }
        else{
            return "Your package is low";
        }
    }

    @RequestMapping("/your_age/{age}")
    public String checkAge(@PathVariable int age){
        if (age>=18){
            return "You are eligible for voting";
        }
        else{
            return "You are not eligible for voting";
        }

    }

    @RequestMapping("/addify/{a}/{b}")
    public String addition3(@PathVariable int a,@PathVariable int b){
        int c=a+b;
        return "addition is "+c;
    }

    @RequestMapping("/subtract/{a}/{b}")
    public String subtraction(@PathVariable int a,@PathVariable int b){
        int c=a-b;
        return "subtraction is "+c;
    }

    @RequestMapping("/into/{a}/{b}")
    public int multiply(@PathVariable int a,@PathVariable int b){
        int c=a*b;
        return c;
    }

    @RequestMapping("/division1/{a}/{b}")
    public double divide(@PathVariable double a, @PathVariable double b){
        double c=a/b;
        return c;
    }
}
