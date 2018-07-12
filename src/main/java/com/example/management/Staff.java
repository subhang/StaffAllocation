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

    private String staff_name;
    private int salary;
    private int current_hotel_id;
    private int cluster_id;

    public int getCluster_id() {
        return cluster_id;
    }

    public void setCluster_id(int cluster_id) {
        this.cluster_id = cluster_id;
    }

    public Staff() {
    }

    public Staff(int staff_id, String staff_name, int cluster_id, int salary, int current_hotel_id) {
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.salary = salary;
        this.current_hotel_id = current_hotel_id;
        this.cluster_id = cluster_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getstaff_name() {
        return staff_name;
    }

    public void setstaff_name(String staff_name) {
        this.staff_name = staff_name;
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
