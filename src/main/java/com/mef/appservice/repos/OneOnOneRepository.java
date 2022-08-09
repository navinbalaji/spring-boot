package com.mef.appservice.repos;

import com.mef.appservice.entities.OneOnOne;
import org.springframework.data.repository.CrudRepository;

public interface OneOnOneRepository extends CrudRepository<OneOnOne, Integer> {
}
