package com.mef.appservice.repos;

import com.mef.appservice.entities.StudentLeave;
import org.springframework.data.repository.CrudRepository;

public interface StudentLeaveRepository extends CrudRepository<StudentLeave, Integer> {
}
