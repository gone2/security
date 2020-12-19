package com.security.project.controller;

import java.util.ArrayList;
import java.util.List;

import com.security.project.dto.UserDto;
import com.security.project.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public ModelAndView login() throws Exception {
        ModelAndView mvn = new ModelAndView("login");

        System.out.println("login page method");

        mvn.addObject("name", "jiwon");

        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");

        mvn.addObject("list", testList);

        // List<UserDto> testList = userService.selectUser();

        // System.out.println(testList);
        return mvn;
    }
}
