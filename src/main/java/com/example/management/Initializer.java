package com.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Initializer {

    @Autowired
    HotelRepository hotelRepository;


    @RequestMapping("/start")
    public String calcRatios(){

        Iterable<Hotel> hotels = hotelRepository.findAll();

        for (Hotel i: hotels) {

            i.updateRatio();
            hotelRepository.save(i);
        }
        return "updated Ratios";


    }


}
