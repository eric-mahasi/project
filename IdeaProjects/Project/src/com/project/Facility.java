package com.project;

public class Facility {
    private String facilityId;
    private String facilityType;
    private String facilityName;
    private String cleanDay1;
    private String cleanDay2;
    private int capacity;
    private int numberOfProjectors;
    private int numberOfWhiteboards;
    private int numberOfCleaners;
    private boolean booked;

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getCleanDay1() {
        return cleanDay1;
    }

    public void setCleanDay1(String cleanDay1) {
        this.cleanDay1 = cleanDay1;
    }

    public String getCleanDay2() {
        return cleanDay2;
    }

    public void setCleanDay2(String cleanDay2) {
        this.cleanDay2 = cleanDay2;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfProjectors() {
        return numberOfProjectors;
    }

    public void setNumberOfProjectors(int numberOfProjectors) {
        this.numberOfProjectors = numberOfProjectors;
    }

    public int getNumberOfWhiteboards() {
        return numberOfWhiteboards;
    }

    public void setNumberOfWhiteboards(int numberOfWhiteboards) {
        this.numberOfWhiteboards = numberOfWhiteboards;
    }

    public int getNumberOfCleaners() {
        return numberOfCleaners;
    }

    public void setNumberOfCleaners(int numberOfCleaners) {
        this.numberOfCleaners = numberOfCleaners;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}
