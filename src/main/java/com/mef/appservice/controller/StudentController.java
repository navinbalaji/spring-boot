package com.mef.appservice.controller;

import com.mef.appservice.handler.StudentHandler;
import com.mef.appservice.model.LeaveDetails;
import com.mef.appservice.model.SessionDetails;
import com.mef.appservice.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/student")
public class StudentController {

    private static final Logger logger = LogManager.getLogger(StudentController.class);

    @Autowired
    StudentHandler studentHandler;

    public StudentController() {
    }

    @GetMapping("/{id}/class")
    public void getClassSession(@PathVariable long studentId){

    }

    @GetMapping("/{studentId}")
    public ResponseEntity<User> getStudentDetails(@PathVariable long studentId){
        try{
            logger.info("getStudentDetails:"+studentId);
            User user = studentHandler.getUserDetails(studentId);
            logger.info("Constructed  Response:"+user.toString());
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
        }
        catch (Exception ex){
            logger.error("getStudentDetails: Exception occured "+studentId+" --> "+ex.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/{studentId}/sessionDetails")
    public ResponseEntity<SessionDetails> getSessionDetails(@PathVariable long studentId){
        try{
            logger.info("getSessionDetails:"+studentId);
            SessionDetails sessionDetails = studentHandler.getSessionDetails(studentId);
            logger.info("Constructed  Response:"+sessionDetails.toString());
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(sessionDetails);
        }
        catch (Exception ex){
            logger.error("getSessionDetails: Exception occured "+studentId+" --> "+ex.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
