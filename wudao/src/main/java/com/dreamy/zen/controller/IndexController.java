package com.dreamy.zen.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    /**
     * localhost:8080/hello
     * @return
     */
    @RequestMapping(name = "/login")
    public  String login (){
        return  "login";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public  String  index(){
        return  "index";
    }

}