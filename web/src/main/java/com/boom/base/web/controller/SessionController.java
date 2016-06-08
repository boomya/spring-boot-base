package com.boom.base.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by jiangshan on 16/4/28.
 */
@RestController
@RequestMapping("/session")
public class SessionController {
    @RequestMapping
    public String setSession(HttpSession session, @RequestParam(value = "name") String name){
        session.setAttribute("name", name);
        return "success";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getSession(HttpSession session){
        String name = session.getAttribute("name").toString();
        return name;
    }

}
