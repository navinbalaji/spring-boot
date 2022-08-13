package com.mef.appservice.controller;

import com.mef.appservice.entities.User;
import com.mef.appservice.handler.UserHandler;
import com.mef.appservice.model.LeaveDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    UserHandler userHandler;

    private static final Logger logger = LogManager.getLogger(AdminController.class);

    @GetMapping("/{id}/leave")
    public ResponseEntity<LeaveDetails> getLeave(@PathVariable long userId){
        try{
            logger.info("GetLeave:"+userId);
            LeaveDetails leaves = userHandler.getLeaveDetails(userId);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(leaves);
        }
        catch (Exception ex){
            logger.error("GetLeave: Exception occured "+userId+" --> "+ex.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PostMapping("/{id}/leave")
    public ResponseEntity<String> applyLeave(@RequestBody LeaveDetails leaveDetails){
        try{
            logger.info("applyLeave:"+leaveDetails.toString());
            userHandler.applyLeave(leaveDetails.getId(),leaveDetails.getLeaveDates());
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
        }
        catch (Exception ex){
            logger.error("applyLeave: Exception occured "+leaveDetails.getId()+" --> "+ex.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }

    }
}
