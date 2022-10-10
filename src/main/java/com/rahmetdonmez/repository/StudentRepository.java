package com.rahmetdonmez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahmetdonmez.model.Student;

@Repository("student_repo")
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
