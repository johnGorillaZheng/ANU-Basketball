package com.pink.anubasketball.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pink.anubasketball.model.CompetitionManager;
import com.pink.anubasketball.serviceimpl.CompetitionManagerServiceImpl;

@Controller
@RequestMapping("/CompetitionManager")
public class CompetitionManagerController {

    @Autowired
    private CompetitionManagerServiceImpl competitionManagerServiceImpl;
    
    @Autowired
    private CompetitionManager competitionManager;
    
    @RequestMapping(value="/signIn",method = RequestMethod.POST)
    public String signIn(HttpServletRequest request) {
        String username=request.getParameter("email");
        String password = request.getParameter("password");
        competitionManager = competitionManagerServiceImpl.signIn(username, password);
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        if(competitionManager!=null) {
            session.setAttribute("user", competitionManager);
            if(request.getParameter("remember-me")!=null)
                session.setMaxInactiveInterval(30*60);
            return "index";
        }
        else 
            request.setAttribute("error", "wrong username or password");
        return "login";
    }
    
    
    @RequestMapping(value="/signUp",method=RequestMethod.POST)
    public String signUp(HttpServletRequest request) {
        String username=request.getParameter("email");
        String password = request.getParameter("password");
        String firstName=request.getParameter("first_name");
        String lastName=request.getParameter("last_name");
        competitionManager.setUsername(username);
        competitionManager.setPassword(password);
        competitionManager.setFirstName(firstName);
        competitionManager.setLastName(lastName);
        competitionManager.setCreateTime(new Date());
        competitionManager.setModifiedTime(competitionManager.getCreateTime());
        competitionManager=competitionManagerServiceImpl.signUp(competitionManager);
        HttpSession session = request.getSession();
        if(competitionManager!=null) {
            session.setAttribute("user", competitionManager);
            return "index";
        }
        else {
            request.setAttribute("error", "username already exists");
            return "register";
        }
    }
    
    @RequestMapping(value="/signOut",method=RequestMethod.GET)
    public String signOut(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "index";
    }
    
    @RequestMapping(value="/toSignUp",method=RequestMethod.GET)
    public String toSignUp(HttpServletRequest request) {
        return "register";
    }
    
    @RequestMapping(value="/toSignIn",method=RequestMethod.GET)
    public String toSignIn(HttpServletRequest request) {
        return "login";
    }
}
