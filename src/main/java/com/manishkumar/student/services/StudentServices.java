package com.manishkumar.student.services;

import com.manishkumar.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentServices {

  public Student saveStudent(Student student);
  public List<Student> getAllStudent();

    void deleteStudentById(long id);
}
