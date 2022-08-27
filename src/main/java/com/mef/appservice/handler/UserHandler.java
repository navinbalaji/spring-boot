package com.mef.appservice.handler;

import com.mef.appservice.entities.User;
import com.mef.appservice.entities.UserLeave;
import com.mef.appservice.model.LeaveDetails;
import com.mef.appservice.repos.UserLeaveRepository;
import com.mef.appservice.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserHandler {

    @Autowired
    UserLeaveRepository userLeaveRepository;

    @Autowired
    UserRepository userRepository;

    public void applyLeave(long userId,List<String> dates) throws Exception {
        try{
            List<UserLeave> userLeaves = new ArrayList<>();
            for(String date: dates) {
                UserLeave userLeave = new UserLeave();
                Optional<User> user = userRepository.findById((int) userId);
                if (user.isEmpty()) {
                    throw new Exception("User not exsit");
                }
                userLeave.setUser(user.get());
                userLeave.setDate(LocalDate.parse(date));

                userLeaves.add(userLeave);
            }
            userLeaveRepository.saveAll(userLeaves);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    public LeaveDetails getLeaveDetails(long userId){
        LeaveDetails leaveDetails = new LeaveDetails();
        try{
            List<UserLeave> userLeaves = userLeaveRepository.findByUser(userRepository.findById((int)userId).get());
            leaveDetails.setId(userId);
            leaveDetails.setLeaveDates(userLeaves.stream().map(UserLeave::getDate).collect(Collectors.toList()));
            leaveDetails.setAllowedLeaves(5);

            return leaveDetails;
        }
        catch (Exception ex){
            throw ex;
        }
    }

}
