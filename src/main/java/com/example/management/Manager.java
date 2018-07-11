package com.example.management;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="managers")

public class Manager {

    @Id
    private int manager_id;

    private String name;
    private String user_name;
    private String password;
    private int hotel_id;

    public Manager(int manager_id, String name, String user_name, String password, int hotel_id) {
        this.manager_id = manager_id;
        this.name = name;
        this.user_name = user_name;
        this.password = password;
        this.hotel_id = hotel_id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }
}

