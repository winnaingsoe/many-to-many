package com.example.manytomany.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int duration;
    private double price;

    public Subject() {

    }

    public Subject(String name, int duration, double price) {
        this.name = name;
        this.duration = duration;
        this.price = price;
    }
}
