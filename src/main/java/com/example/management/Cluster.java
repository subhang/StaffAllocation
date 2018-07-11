package com.example.management;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clusters")
public class Cluster {

    @Id
    private int cluster_id;

    private String cluter_name;

}
