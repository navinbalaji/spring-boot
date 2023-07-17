package com.mef.appservice.model;

import java.util.Date;
import java.util.TimeZone;

public class ClassDetails {
    private String teacherName;
    private Date date;
    private TimeZone time;
    private String link;
    private MEFClass detail;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TimeZone getTime() {
        return time;
    }

    public void setTime(TimeZone time) {
        this.time = time;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public MEFClass getDetail() {
        return detail;
    }

    public void setDetail(MEFClass detail) {
        this.detail = detail;
    }
}