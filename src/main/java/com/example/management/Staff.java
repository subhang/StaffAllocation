package com.example.management;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {

    @Id
    private int staff_id;

    //   @GeneratedValue(strategy = GenerationType.AUTO)

    private String name;
    private int salary;
    private int current_hotel_id;

    public Staff() {
    }

    public Staff(int staff_id, String name, int cluster_id, int salary, int current_hotel_id) {
        this.staff_id = staff_id;
        this.name = name;
        this.salary = salary;
        this.current_hotel_id = current_hotel_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCurrent_hotel_id() {
        return current_hotel_id;
    }

    public void setCurrent_hotel_id(int current_hotel_id) {
        this.current_hotel_id = current_hotel_id;
    }
}
