package com.hotel_reservation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();
    HotelReservationSystem newHotel1 = hotelReservation.addHotel("Lakewood",110);
    HotelReservationSystem newHotel2 = hotelReservation.addHotel("Bridgewood",150);
    HotelReservationSystem newHotel3 = hotelReservation.addHotel("Ridgewood",220);

    @Test
    public void givenHotelDetails_whenAddedName_shouldReturnName() {
        assertEquals(newHotel1.getname(),"Lakewood");
        assertEquals(newHotel2.getname(),"Bridgewood");
        assertEquals(newHotel3.getname(),"Ridgewood");
    }
    @Test
    public void givenHotelDetails_whenAddedRegularRate_ShouldReturnRegularRate() {
        assertEquals(newHotel1.getregularRate(), 110);
        assertEquals(newHotel2.getregularRate(), 150);
        assertEquals(newHotel3.getregularRate(), 220);
    }

}
