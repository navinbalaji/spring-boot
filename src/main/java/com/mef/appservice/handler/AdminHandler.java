package com.mef.appservice.handler;

import com.mef.appservice.entities.User;
import com.mef.appservice.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminHandler {

    @Autowired
    private UserRepository userRepository;

    public AdminHandler() {
    }
    public void addUser(User user){
        userRepository.save(user);
    }
}
