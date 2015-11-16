package com.guestdriven.core.microservices.model;


public class DELMessageAcknowledgement {

    private String id;
    private String status;
    private String payload;

    public DELMessageAcknowledgement() {

    }

    public DELMessageAcknowledgement(String id, String status, String payload) {
        this.id = id;
        this.status = status;
        this.payload = payload;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
