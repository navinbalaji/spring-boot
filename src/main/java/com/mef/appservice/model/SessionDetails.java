package com.mef.appservice.model;

public class SessionDetails {
    private long id;
    private int totalSession;
    private int completedSessions;
    private MEFClass mefClass;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTotalSession() {
        return totalSession;
    }

    public void setTotalSession(int totalSession) {
        this.totalSession = totalSession;
    }

    public int getCompletedSessions() {
        return completedSessions;
    }

    public void setCompletedSessions(int completedSessions) {
        this.completedSessions = completedSessions;
    }

    public MEFClass getMefClass() {
        return mefClass;
    }

    public void setMefClass(MEFClass mefClass) {
        this.mefClass = mefClass;
    }

    @Override
    public String toString() {
        return "SessionDetails{" +
                "id=" + id +
                ", totalSession=" + totalSession +
                ", completedSessions=" + completedSessions +
                ", mefClass=" + mefClass +
                '}';
    }
}
