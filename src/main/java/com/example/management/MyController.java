package com.example.management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    StaffRepository repository;

    @RequestMapping("/save")

    public String process(Model model) {

        Staff hyd = repository.save(new Staff(200, "shanks", 2,5000,6));
       return "done";
        //return (List<Staff>) repository.findAll();
    }


}
