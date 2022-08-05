package com.mef.appservice.model.student;

import com.mef.appservice.model.MEFClass;

public class StudentClass {
    private MEFClass mefClass;
    private String teacher;
    private String time;
    private String meetingURL;

    public MEFClass getMefClass() {
        return mefClass;
    }

    public void setMefClass(MEFClass mefClass) {
        this.mefClass = mefClass;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMeetingURL() {
        return meetingURL;
    }

    public void setMeetingURL(String meetingURL) {
        this.meetingURL = meetingURL;
    }
}
