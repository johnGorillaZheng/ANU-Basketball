package com.pink.anubasketball.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    
    @RequestMapping(value = "/")
    public String welcome(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null)
            return "login";
        else
            return "index";
    }
    
    @RequestMapping(value = "/toIndex")
    public String toIndex(HttpServletRequest request) {
        return "index";
    }
}
