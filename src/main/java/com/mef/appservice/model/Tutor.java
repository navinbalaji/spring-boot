package com.mef.appservice.model;

public class Tutor {
    private Long id;
    private TutorDetails tutorDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TutorDetails getTutorDetails() {
        return tutorDetails;
    }

    public void setTutorDetails(TutorDetails tutorDetails) {
        this.tutorDetails = tutorDetails;
    }
}
