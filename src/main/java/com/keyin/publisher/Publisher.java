package com.keyin.publisher;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long publisherID;

    private String publisherName;

    private String publisherAddress;

    public Publisher() {
    }

    public Publisher(String publisherName, String publisherAddress) {
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
    }

    public long getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(long publisherID) {
        this.publisherID = publisherID;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }


}
