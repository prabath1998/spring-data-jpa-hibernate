package com.example.springjpa.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springjpa.entity.Guardian;
import com.example.springjpa.entity.Student;



@SpringBootTest
class StudentRepositoryTest {
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void saveStudent() {
		Student student = Student.builder()
				.emailid("prabath@gmail.com")
				.firstName("prabath")
				.lastName("udayanga")
//				.guardianName("inoka")
//				.guardianEmail("inoka@gmail.com")
//				.guardianMobile("0111111111")
				.build();
		studentRepository.save(student);
	}
	
	@Test
	public void saveStudentWithGuardian() {
		
		Guardian guardian = Guardian.builder()
				.email("jaya@gmail.com")
				.name("jaya")
				.mobile("0222222222")
				.build();
		
		Student student = Student.builder()
				.firstName("janaka")
				.emailid("jana@gmail.com")
				.lastName("chathuranga")
				.guardian(guardian)
				.build();
		
		studentRepository.save(student);
		
	}
	
	@Test
	public void printAllStudents() {
		List<Student> studentList = studentRepository.findAll();
		System.out.println("Student List = " + studentList);
	}

}


