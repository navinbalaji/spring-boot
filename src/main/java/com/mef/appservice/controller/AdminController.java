package com.mef.appservice.controller;

import com.mef.appservice.entities.User;
import com.mef.appservice.handler.AdminHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AdminController {

    @Autowired
    private AdminHandler adminHandler;

    private static final Logger logger = LogManager.getLogger(AdminController.class);

    public AdminController() {
    }

    @GetMapping("/admin")
    ResponseEntity<String> index() {
        try{
            logger.info("Enter admin page");
        }
        catch (Exception ex){
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("Welcome to the admin page");
    }
}
