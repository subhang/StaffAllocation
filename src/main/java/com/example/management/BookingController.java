package com.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {


    @Autowired
    BookingService bookingService;

    @RequestMapping("/bookroom/{id}")
    public String bookRoom(@PathVariable int id){

        return bookingService.BookRoom(id);

    }




}
