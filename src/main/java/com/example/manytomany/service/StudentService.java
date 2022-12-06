package com.example.manytomany.service;

import com.example.manytomany.dao.StudentDao;
import com.example.manytomany.dao.SubjectDao;
import com.example.manytomany.ds.Student;
import com.example.manytomany.ds.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private SubjectDao subjectDao;

    @Transactional
    public void createDb() {
        Student s1 = new Student("John Doe", "ISM");
        Student s2 = new Student("John William", "PISM");
        Student s3 = new Student("Thomas Hardy", "ISY");

        Subject subject1 = new Subject("Python", 3, 2000);
        Subject subject2 = new Subject("Groovy", 6, 3000);
        Subject subject3 = new Subject("Java", 6, 2000);

        s1.addSubject(subject1);
        s1.addSubject(subject2);
        s1.addSubject(subject3);

        s2.addSubject(subject3);
        s3.addSubject(subject3);

        studentDao.save(s1);
        studentDao.save(s2);
        studentDao.save(s3);
    }
}
