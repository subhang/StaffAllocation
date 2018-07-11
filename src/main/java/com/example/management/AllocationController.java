package com.example.management;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllocationController {


    @Autowired
    AllocationService allocationService;

    @RequestMapping("/allocatestaff/{id}/")
    public String bookRoom(@PathVariable int id){


        return allocationService.AllocateStaff(id);

    }


}
