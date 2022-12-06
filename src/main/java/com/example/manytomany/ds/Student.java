package com.example.manytomany.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String school;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Subject> subjects = new ArrayList<>();

    public Student() {

    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }
}
