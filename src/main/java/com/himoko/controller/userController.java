package com.himoko.controller;

import com.himoko.pojo.User;
import com.himoko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    UserService userService;

    @RequestMapping("findUsers")
    @ResponseBody
    public List<User> findUsers(){
        List<User> userList = userService.findUsers();
        return userList;
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        List<User> userList = userService.findUsers();
        return "test";
    }
}
