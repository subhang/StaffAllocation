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

    public String BookRoom(int id) {

        Iterable<Hotel> hotels = hotelRepository.findAll();

        Hotel hotel = new Hotel();
        for (Hotel i : hotels)
            if (i.getHotel_id() == id) {

                Hotel temp = new Hotel(i);
                if(i.getCurrent_bookings() != i.getTotal_rooms()) {
                    temp.setCurrent_bookings(i.getCurrent_bookings() + 1);
                    hotelRepository.save(temp);
                    float total_rooms = (float) i.getTotal_rooms();
                    float current_staff = (float) i.getCurrent_staff();
                    float min_staff = (float) i.getMin_staff();
                    if(total_rooms / current_staff > min_staff){

                        //AllocationService.AllocateStaff(id);
                        int x = 10;
                    }



                }
                hotel = i;
            }

        return "Room Booked for hotel id " + Integer.toString(hotel.getHotel_id());

    }



}
