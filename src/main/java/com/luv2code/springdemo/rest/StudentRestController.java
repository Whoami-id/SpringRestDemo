
package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    // define PostConstruct to load the students data only once
    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("Poornima", "Patel"));
        students.add(new Student("Mario", "Rossi"));
        students.add(new Student("Mary", "Smith"));
    }

    // define endpoint for student return list of students
    @GetMapping("students")
    public List<Student> getStudent() {
        return students;
    }

    // define endpoint for /students/{studentId} return student at index
    @GetMapping("students/{studentId}")
    public Student getStudent(@PathVariable final int studentId) {

        // check students id against list size
        if (studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id no found" + studentId);
        }
        return students.get(studentId);
    }

}
