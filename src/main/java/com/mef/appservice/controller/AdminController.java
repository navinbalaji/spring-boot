package com.mef.appservice.controller;

import com.mef.appservice.entities.User;
import com.mef.appservice.handler.AdminHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AdminController {

    @Autowired
    private AdminHandler adminHandler;

    public AdminController() {
    }

    @GetMapping("/admin")
    String index() {
        adminHandler.addUser(new User("1234","1111","8531002318",new Date(),new Date(),1));
        return "welcome to admin page";
    }
}
