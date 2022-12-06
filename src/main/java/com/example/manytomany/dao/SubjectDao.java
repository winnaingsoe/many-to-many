package com.example.manytomany.dao;

import com.example.manytomany.ds.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectDao extends CrudRepository<Subject,Integer> {
}
