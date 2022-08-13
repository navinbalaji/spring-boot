package com.mef.appservice.repos;

import com.mef.appservice.entities.OneOnOneSlot;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OneOnOneSlotRepository extends CrudRepository<OneOnOneSlot, Integer> {
    Optional<List<OneOnOneSlot>> findByOneOnOneId(Integer integer);
}
