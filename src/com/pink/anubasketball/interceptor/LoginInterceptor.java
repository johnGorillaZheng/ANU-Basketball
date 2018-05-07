package com.pink.anubasketball.interceptor;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.pink.anubasketball.model.CompetitionManager;


public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private CompetitionManager user;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        user = (CompetitionManager) request.getSession().getAttribute("user");
        String requestURL = request.getRequestURI();
        List<String> forbiddenURLS = new ArrayList<String>();
        //forbiddenURLS.add("/CompetitionManager");
        for (String forbiddenURL : forbiddenURLS) {
            if (requestURL.contains(forbiddenURL) && null == user) {
                response.sendRedirect("/anubasketball/CompetitionManager/toSignIn");
                return false;
            }
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o,
            ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e)
            throws Exception {

    }
}
