package com.rahmetdonmez.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rahmetdonmez.model.Captain;
import com.rahmetdonmez.model.Student;
import com.rahmetdonmez.model.Team;


public interface StudentService {
	List<Student> findStudents();
	Student findStudent(int id);
	void createStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Student student);

}
