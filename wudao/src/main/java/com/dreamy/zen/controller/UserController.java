package com.dreamy.zen.controller;


import com.dreamy.zen.domain.UserDomain;
import com.dreamy.zen.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController
@Controller
@RequestMapping("/user")
public class UserController {


   @Autowired
   UserService userService;

   @ResponseBody
   @PostMapping("/add")
    public  int addUser (UserDomain user){
        return  userService.insertUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public  Object findAllUser(
            @RequestParam (name ="pageNum" , required = false, defaultValue = "1") int pageNum,
            @RequestParam(name="pageSize",required = false,defaultValue = "10") int pageSize
    ){
   return   userService.findAllUser(pageNum,pageSize);

    }
    @ResponseBody
    @GetMapping("/list.html")
    public  Object findAllUserList(
            @RequestParam (name ="pageNum" , required = false, defaultValue = "1") int pageNum,
            @RequestParam(name="pageSize",required = false,defaultValue = "10") int pageSize, Model
model            ){
        PageInfo<UserDomain> pageInfo= userService.findAllUser(pageNum,pageSize);
        Map<String,Object> map = new HashMap<String ,Object>();
        map.put("pageInfo",pageInfo);
        return map;
    }

    //@ResponseBody
    @GetMapping("/list")
    public String  list (  ModelMap map    ){
        List<UserDomain> userList =userService.findAllUser();
        map.addAttribute("userList",userList);
        //System.out.println(map.toString());
        return  "list";
    }
}
