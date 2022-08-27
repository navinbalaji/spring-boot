package com.mef.appservice.entities;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)",nullable = false)
    private UUID id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "data_of_joining")
    private LocalDate dataOfJoining;

    @Column(name = "plan_type")
    private Integer planType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userid", nullable = false)
    private User userid;

    public Student() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDataOfJoining() {
        return dataOfJoining;
    }

    public void setDataOfJoining(LocalDate dataOfJoining) {
        this.dataOfJoining = dataOfJoining;
    }

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

}