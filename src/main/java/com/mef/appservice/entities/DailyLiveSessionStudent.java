package com.mef.appservice.entities;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

@Entity
@Table(name = "daily_live_session_student")
public class DailyLiveSessionStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "daily_live_id", nullable = false)
    private DailyLiveSession dailyLive;

    public DailyLiveSessionStudent() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DailyLiveSession getDailyLive() {
        return dailyLive;
    }

    public void setDailyLive(DailyLiveSession dailyLive) {
        this.dailyLive = dailyLive;
    }

}