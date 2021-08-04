package com.hotel_reservation;
public class HotelReservation {

 //Method to Print the welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to Hotel Management system");
    }

  //Purpose : Method to add hotel name and rates
    public HotelReservationSystem addHotel(String name, int regularRate) {
        return new HotelReservationSystem(name,regularRate);
    }
}
