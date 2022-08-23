package com.mef.appservice.entities;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "grammer_session")
public class GrammerSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "slot_time")
    private Instant slotTime;

    @Column(name = "topic_name")
    private String topicName;

    @Column(name = "summary", length = 10000)
    private String summary;

    @Column(name = "recorded_url", length = 1000)
    private String recordedUrl;

    @Column(name = "transcript_url", length = 1000)
    private String transcriptUrl;

    public GrammerSession() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(Instant slotTime) {
        this.slotTime = slotTime;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getRecordedUrl() {
        return recordedUrl;
    }

    public void setRecordedUrl(String recordedUrl) {
        this.recordedUrl = recordedUrl;
    }

    public String getTranscriptUrl() {
        return transcriptUrl;
    }

    public void setTranscriptUrl(String transcriptUrl) {
        this.transcriptUrl = transcriptUrl;
    }

}