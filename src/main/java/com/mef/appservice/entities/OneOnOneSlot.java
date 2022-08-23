package com.mef.appservice.entities;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

@Entity
@Table(name = "one_on_one_slot")
public class OneOnOneSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "one_on_one_id", nullable = false)
    private OneOnOne oneOnOne;

    @Column(name = "is_completed")
    private Integer isCompleted;

    @Column(name = "slot_name")
    private String slotName;

    @Column(name = "description", length = 5000)
    private String description;

    public OneOnOneSlot() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OneOnOne getOneOnOne() {
        return oneOnOne;
    }

    public void setOneOnOne(OneOnOne oneOnOne) {
        this.oneOnOne = oneOnOne;
    }

    public Integer getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Integer isCompleted) {
        this.isCompleted = isCompleted;
    }

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}