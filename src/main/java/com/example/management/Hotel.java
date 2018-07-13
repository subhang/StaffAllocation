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
    private int manager_id;
    private int cluster_id;
    private int total_rooms;

    private int current_rooms;
    private int current_staff;
    private float ratio;

    public Hotel(){

    }
    //yo yo

    public Hotel(Hotel hotel){
        this.hotel_id = hotel.hotel_id;
        this.hotel_name = hotel.hotel_name;
        this.manager_id = hotel.manager_id;
        this.cluster_id = hotel.cluster_id;
        this.total_rooms = hotel.total_rooms;
        this.current_rooms = hotel.current_rooms;
        this.current_staff = hotel.current_staff;
        this.ratio = (float) hotel.current_rooms / (float) hotel.current_staff ;

    }

    public Hotel(int hotel_id, String hotel_name, int manager_id, int total_rooms, int current_rooms, int current_staff, float ratio, int cluster_id) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.manager_id = manager_id;
        this.total_rooms = total_rooms;
        this.current_rooms = current_rooms;
        this.current_staff = current_staff;
        this.ratio = (float) current_rooms / (float) current_staff ;
        this.cluster_id = cluster_id;
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

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getCluster_id() {
        return cluster_id;
    }

    public void setCluster_id(int cluster_id) {
        this.cluster_id = cluster_id;
    }

    public int getTotal_rooms() {
        return total_rooms;
    }

    public void setTotal_rooms(int total_rooms) {
        this.total_rooms = total_rooms;
    }

    public int getCurrent_rooms() {
        return current_rooms;
    }

    public void setCurrent_rooms(int current_rooms) {
        this.current_rooms = current_rooms;
    }

    public int getCurrent_staff() {
        return current_staff;
    }

    public void setCurrent_staff(int current_staff) {
        this.current_staff = current_staff;
    }

    public float getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }
    public void updateRatio(){

        this.ratio = (float) current_rooms / (float) current_staff ;

    }
}
