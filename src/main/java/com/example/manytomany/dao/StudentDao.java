package com.example.manytomany.dao;

import com.example.manytomany.ds.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Integer> {

}
