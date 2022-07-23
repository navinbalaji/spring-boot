package com.mef.appservice.repos;

import com.mef.appservice.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
