package com.nisum.assignment2.service;

import com.nisum.assignment2.model.Student;
import com.nisum.assignment2.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public List<Student> listAll() {
        return studentDAO.list();
    }

    public Student getById(int id) {
        return studentDAO.get(id);
    }

    public void save(Student student) {
        studentDAO.save(student);
    }

    public void update(Student student) {
        studentDAO.update(student);
    }

    public void delete(int id) {
        studentDAO.delete(id);
    }
}

