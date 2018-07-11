package com.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllocationService {


    @Autowired
    HotelRepository hotelRepository;

    public void AllocateStaff(int hotel_id){

        Iterable<Hotel> hotels = hotelRepository.findAll();

        for (Hotel i: hotels
             ) {




        }


    }


}
