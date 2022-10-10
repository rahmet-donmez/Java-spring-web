package com.rahmetdonmez.service.ımpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahmetdonmez.model.Student;
import com.rahmetdonmez.repository.StudentRepository;
import com.rahmetdonmez.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository student_repo;

	@Override
	@Transactional
	public List<Student> findStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		Optional<Student> student=student_repo.findById(id);
		return student.get();
	}

	@Override
	@Transactional
	public void createStudent(Student student) {
		student_repo.save(student);

	}

	@Override
	@Transactional
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void deleteStudent(Student student) {
		student_repo.delete(student);
	}

}
