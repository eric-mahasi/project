package com.project;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Facility facility1 = new Facility();
        Facility facility2 = new Facility();
        Facility facility3 = new Facility();
        Facility facility4 = new Facility();
        Facility facility5 = new Facility();

        facility1.setFacilityName("Main Conference Hall");
        facility1.setFacilityType("Room");
        facility1.setCapacity(70);
        facility1.setNumberOfProjectors(2);
        facility1.setNumberOfWhiteboards(2);

        facility2.setFacilityName("Meeting Delight");
        facility2.setFacilityType("Room");
        facility2.setCapacity(20);
        facility2.setNumberOfProjectors(1);
        facility2.setNumberOfWhiteboards(1);

        facility3.setFacilityName("East Wing");
        facility3.setFacilityType("Corridor");

        facility4.setFacilityName("West Wing");
        facility4.setFacilityType("Corridor");

        facility5.setFacilityName("Main");
        facility5.setFacilityType("Reception");

        Booking booking1 = new Booking();
        booking1.setFacility(facility1);

        Booking booking2 = new Booking();
        booking2.setFacility(facility2);

        Booking booking3 = new Booking();
        booking3.setFacility(facility3);

        Booking booking4 = new Booking();
        booking4.setFacility(facility4);

        Booking booking5 = new Booking();
        booking5.setFacility(facility5);

        ArrayList<Booking> bookings = new ArrayList<>();
        bookings.add(booking1);
        bookings.add(booking2);
        bookings.add(booking3);
        bookings.add(booking4);
        bookings.add(booking5);

        ArrayList<Facility> facilities = new ArrayList<>();
        facilities.add(facility1);
        facilities.add(facility2);

        Report.displayFacilities(bookings);
        Report.displayRoomDetails(facilities);
     }
}
