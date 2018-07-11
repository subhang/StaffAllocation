package com.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    AllocationService allocationService;

    public String BookRooms(int id,int rooms) {

        Iterable<Hotel> hotels = hotelRepository.findAll();

        Hotel hotel = new Hotel();
        for (Hotel i : hotels)
            if (i.getHotel_id() == id) {

                Hotel temp = new Hotel(i);
                temp.setCurrent_bookings(i.getCurrent_bookings()+rooms);
                temp.updateRatio();
                hotelRepository.save(temp);

            }

        return "Room Booked for hotel id " + Integer.toString(hotel.getHotel_id());

    }



}
