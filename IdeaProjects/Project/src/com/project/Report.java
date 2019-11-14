package com.project;

import java.util.ArrayList;

public class Report {
    private static String shortLine = "==================================";
    public static void displayFacilities(ArrayList<Booking> bookings) {
        System.out.println("LIST OF ALL FACILITIES");
        System.out.println(shortLine);
        for(Booking booking: bookings) {
            String name = booking.getFacility().getFacilityName();
            String type = booking.getFacility().getFacilityType();
            System.out.println("[" + type + "]" + " " + name);
        }
        System.out.println();
    }

    public static void displayRoomDetails(ArrayList<Facility> facilities) {
        System.out.println(shortLine);
        System.out.println("LIST OF ROOM DETAILS");
        for(Facility facility: facilities) {
            String name = facility.getFacilityName();
            int capacity = facility.getCapacity();
            int projectors = facility.getNumberOfProjectors();
            int whiteboards = facility.getNumberOfWhiteboards();
            System.out.println("[Room name:] " + name);
            System.out.println("[Capacity:] " + capacity);
            System.out.println("[Projectors:] " + projectors);
            System.out.println("[Whiteboards:] " + whiteboards);
            System.out.println();
        }
        System.out.println();
    }
}
