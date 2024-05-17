package com.manishkumar.student.repository;

import com.manishkumar.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {
}
