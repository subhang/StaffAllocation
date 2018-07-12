package com.example.management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    StaffRepository repository;


    @Autowired
    BookingService bookingService;

    @Autowired
    AllocationService allocationService;

    @RequestMapping("/allocatestaff/{id}")
    public String AllocateStaff(@PathVariable int id){


        return allocationService.AllocateStaff(id);

    }

    @RequestMapping(value = "/bookroom/{hotel_id}/{rooms}")
    public String bookRoom(@PathVariable("hotel_id") int id,@PathVariable("rooms") int rs){


        return bookingService.BookRooms(id,rs);

    }




}
