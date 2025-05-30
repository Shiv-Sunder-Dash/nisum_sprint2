package com.nisum.assignment2.controller;

import com.nisum.assignment2.model.Student;
import com.nisum.assignment2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class CrudController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String listStudents(Model model) {
        List<Student> list = studentService.listAll();
        model.addAttribute("students", list);
        return "list-students";
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.save(student);
        return "redirect:/students/";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable int id, Model model) {
        Student s = studentService.getById(id);
        model.addAttribute("student", s);
        return "edit-student";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute("student") Student student) {
        studentService.update(student);
        return "redirect:/students/";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.delete(id);
        return "redirect:/students/";
    }
}

