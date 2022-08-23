package com.mef.appservice.entities;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

@Entity
@Table(name = "grammer_session_student")
public class GrammerSessionStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "grammer_session_id", nullable = false)
    private GrammerSession grammerSession;

    public GrammerSessionStudent() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GrammerSession getGrammerSession() {
        return grammerSession;
    }

    public void setGrammerSession(GrammerSession grammerSession) {
        this.grammerSession = grammerSession;
    }

}