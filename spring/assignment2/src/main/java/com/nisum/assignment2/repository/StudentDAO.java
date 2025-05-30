package com.nisum.assignment2.repository;

import com.nisum.assignment2.model.Student;
import java.util.List;

public interface StudentDAO {
    void save(Student student);
    void update(Student student);
    void delete(int id);
    Student get(int id);
    List<Student> list();
}