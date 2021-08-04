package com.hotel_reservation;

public class HotelReservationSystem {
    private String name;
    private int regularRate;

    public HotelReservationSystem(String name, int regularRate) {
        this.name = name;
        this.regularRate = regularRate;
    }


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getregularRate() {
        return regularRate;
    }

    public void setRegularRate(int regularRate) {
        this.regularRate = regularRate;
    }


}