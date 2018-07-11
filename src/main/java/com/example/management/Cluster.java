package com.example.management;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clusters")
public class Cluster {

    @Id
    private int ClusterId;

    private String ClusterName;

}
