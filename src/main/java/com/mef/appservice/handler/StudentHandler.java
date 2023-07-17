package com.mef.appservice.handler;

import com.mef.appservice.entities.OneOnOne;
import com.mef.appservice.entities.OneOnOneSlot;
import com.mef.appservice.entities.Student;
import com.mef.appservice.enumeration.MEFClassType;
import com.mef.appservice.enumeration.PlanType;
import com.mef.appservice.model.*;
import com.mef.appservice.repos.OneOnOneRepository;
import com.mef.appservice.repos.OneOnOneSlotRepository;
import com.mef.appservice.repos.StudentRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentHandler {

    private static final Logger logger = LogManager.getLogger(StudentHandler.class);

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    OneOnOneRepository oneOnOneRepository;

    @Autowired
    OneOnOneSlotRepository oneOnOneSlotRepository;

   public User getUserDetails(long studentId){
       try{
            Optional<Student> student = studentRepository.findById((int)studentId);
            if(student.isPresent()){
                User user = new User();
                user.setId(studentId);
                user.setJoiningDate(student.get().getDataOfJoining().toString());
                user.setPlan(PlanType.getEnum(student.get().getPlanType()).name());
                UserDetails userDetails = new UserDetails();
                userDetails.setAvatar("");
                userDetails.setEmail(student.get().getUserid().getUserid());
                userDetails.setPhone(student.get().getUserid().getMobile());
                userDetails.setName(student.get().getFirstname()+" "+student.get().getLastname());
                user.setUserDetails(userDetails);

                return user;
            }
       }
       catch (Exception ex){
            throw ex;
       }

       return null;
   }


   public SessionDetails getSessionDetails(long studentId){
       SessionDetails sessionDetails = new SessionDetails();
       try{
            Optional<OneOnOne> oneOnOne = oneOnOneRepository.findByStudent(studentRepository.findById((int)studentId).get());
            if(oneOnOne.isPresent()){
                Optional<List<OneOnOneSlot>> oneOnOneSlots = oneOnOneSlotRepository.findByOneOnOneId(oneOnOne.get().getId());
                if(oneOnOneSlots.isPresent()){
                    sessionDetails.setId(studentId);
                    sessionDetails.setCompletedSessions((int) oneOnOneSlots.get().stream().filter(x-> x.getIsCompleted() == 1 ).count());
                    sessionDetails.setTotalSession(oneOnOne.get().getNoOfSlots());
                    sessionDetails.setMefClass(new MEFClass(MEFClassType.ONEONONE.name(),""));

                    return sessionDetails;
                }
            }
       }
       catch (Exception ex){
           logger.error("Exception occured while processing session details:"+ex.getMessage());
           throw ex;
       }

       return sessionDetails;
   }


   public ClassDetails getClassDetails(long studentId){
       try{
           //Optional<Student> student=studentRepository.findById((int)studentId);

          // Optional<OneOnOne> o1 = oneOnOneRepository.findByStudent(student.get());
          // Optional<List<OneOnOneSlot>> ls = oneOnOneSlotRepository.findByOneOnOne(o1.get());
          
           return new ClassDetails();
       }catch(Exception e){
           throw e;
       }
   }
}
