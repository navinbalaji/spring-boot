package com.mef.appservice.model;

import java.util.List;

public class ApplyLeave {
    private long id;
    private List<String> date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getDate() {
        return date;
    }

    public void setDate(List<String> date) {
        this.date = date;
    }
}
