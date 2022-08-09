package com.mef.appservice.entities;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "one_on_one")
public class OneOnOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "slot_time")
    private Instant slotTime;

    @Column(name = "no_of_slots")
    private Integer noOfSlots;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(Instant slotTime) {
        this.slotTime = slotTime;
    }

    public Integer getNoOfSlots() {
        return noOfSlots;
    }

    public void setNoOfSlots(Integer noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

}