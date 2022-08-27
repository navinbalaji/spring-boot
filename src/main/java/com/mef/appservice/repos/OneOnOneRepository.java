package com.mef.appservice.repos;

import com.mef.appservice.entities.OneOnOne;
import com.mef.appservice.entities.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OneOnOneRepository extends CrudRepository<OneOnOne, Integer> {
    Optional<OneOnOne> findByStudent(Student student);
}
