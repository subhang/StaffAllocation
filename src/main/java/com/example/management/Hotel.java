package com.example.management;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel {


    @Id
    private int hotel_id;


    private String hotel_name;
    private int cluster_id;
    private int current_bookings;
    private int current_staff;
    private int total_rooms;
    private int min_staff;

    public Hotel(){

    }
    public Hotel(Hotel hotel){

        this.hotel_id = hotel.hotel_id;
        this.hotel_name = hotel.hotel_name;
        this.cluster_id = hotel.cluster_id;
        this.current_bookings = hotel.current_bookings;
        this.current_staff = hotel.current_staff;
        this.total_rooms = hotel.total_rooms;
        this.min_staff = hotel.min_staff;
    }
    public Hotel(int hotel_id, String hotel_name, int cluster_id, int current_bookings, int current_staff, int total_rooms, int min_staff) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.cluster_id = cluster_id;
        this.current_bookings = current_bookings;
        this.current_staff = current_staff;
        this.total_rooms = total_rooms;
        this.min_staff = min_staff;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public int getCluster_id() {
        return cluster_id;
    }

    public void setCluster_id(int cluster_id) {
        this.cluster_id = cluster_id;
    }

    public int getCurrent_bookings() {
        return current_bookings;
    }

    public void setCurrent_bookings(int current_bookings) {
        this.current_bookings = current_bookings;
    }

    public int getCurrent_staff() {
        return current_staff;
    }

    public void setCurrent_staff(int current_staff) {
        this.current_staff = current_staff;
    }

    public int getTotal_rooms() {
        return total_rooms;
    }

    public void setTotal_rooms(int total_rooms) {
        this.total_rooms = total_rooms;
    }

    public int getMin_staff() {
        return min_staff;
    }

    public void setMin_staff(int min_staff) {
        this.min_staff = min_staff;
    }
}
