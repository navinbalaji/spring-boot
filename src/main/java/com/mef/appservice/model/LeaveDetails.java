package com.mef.appservice.model;

import java.util.List;

public class LeaveDetails {
    private long id;
    private List<String> leaveDates;
    private int allowedLeaves;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getLeaveDates() {
        return leaveDates;
    }

    public void setLeaveDates(List<String> leaveDates) {
        this.leaveDates = leaveDates;
    }

    public int getAllowedLeaves() {
        return allowedLeaves;
    }

    public void setAllowedLeaves(int allowedLeaves) {
        this.allowedLeaves = allowedLeaves;
    }
}
