package com.store.user.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @ResponseBody
    @RequestMapping
    public String getUser() {

        return "its works! Heroku";
    }
}