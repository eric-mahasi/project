package com.project;

import java.util.ArrayList;

public class Report {
    private static String shortLine = "==================================";
    private static String longLine =
            "==============================================";
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

    public static void cleanedByTwo(ArrayList<Facility> facilities){
        System.out.println(longLine);
        System.out.println("LIST OF FACILITIES CLEANED BY TWO CLEANERS");
        System.out.println(longLine);
        for(Facility facility: facilities){
            int cleaners = facility.getNumberOfCleaners();
            if(cleaners == 2){
                System.out.println("[Room]" + facility.getFacilityName());
                System.out.println();
            }
        }
    }

    public static void showSchedule(ArrayList<Facility> facilities){
        System.out.println(longLine);
        System.out.println("LIST OF CLEANING DAYS FOR ALL FACILITIES");
        System.out.println(longLine);
        for(Facility facility : facilities){
            String clean = facility.getCleanDay1();
            String clean2 = facility.getCleanDay2();
            String name = facility.getFacilityName();
            String type = facility.getFacilityType();
            if(clean2 == null){
                System.out.println("[" + type + "]" + " " + name + " - " + clean);
            }
            else{
                System.out.println("[" + type + "]" + " " + name + " - " + clean + " " +clean2);
            }
       }
        System.out.println();
    }
}
