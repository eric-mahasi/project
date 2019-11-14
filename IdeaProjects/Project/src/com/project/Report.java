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
}
