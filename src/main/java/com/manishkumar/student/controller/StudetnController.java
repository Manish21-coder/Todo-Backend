package com.manishkumar.student.controller;

import com.manishkumar.student.model.Student;
import com.manishkumar.student.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "https://dailytaskmanager.vercel.app")
public class StudetnController {

    @Autowired
    private StudentServices studentServices;


    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){

        Student savedStudent = studentServices.saveStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping("/Getall")
    public ResponseEntity<Collection<Student>> getAllStudents(){
        Collection<Student> students = studentServices.getAllStudent();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable Long id){
        System.out.println("id" + id);
        studentServices.deleteStudentById(id);
    }


}
