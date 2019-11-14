package com.project;

public class Facility {
    private String facilityId;
    private String facilityType;
    private String facilityName;
    private int capacity;
    private int numberOfProjectors;
    private int numberOfWhiteBoards;
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

    public int getNumberOfWhiteBoards() {
        return numberOfWhiteBoards;
    }

    public void setNumberOfWhiteBoards(int numberOfWhiteBoards) {
        this.numberOfWhiteBoards = numberOfWhiteBoards;
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
