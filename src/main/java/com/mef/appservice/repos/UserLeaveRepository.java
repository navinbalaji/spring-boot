package com.mef.appservice.repos;

import com.mef.appservice.entities.User;
import com.mef.appservice.entities.UserLeave;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserLeaveRepository extends CrudRepository<UserLeave, Integer> {
    List<UserLeave> findByUser(User user);
}
