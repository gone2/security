package com.security.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.security.project.dto.UserDto;
import com.security.project.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public ModelAndView login() throws Exception {
        ModelAndView mvn = new ModelAndView("login");

        System.out.println("login page method");

        return mvn;
    }

    @PostMapping(value="/loginCheck")
    public ModelAndView postMethodName(HttpServletRequest request) throws Exception {
        ModelAndView mvn = new ModelAndView("home");

        System.out.println("request ::: " + request.getParameter("userId"));
        System.out.println("request ::: " + request.getParameter("userPw"));
        System.out.println("user login check method");
        
        return mvn;
    }
    
}
