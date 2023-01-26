package com.kavya.studentdal;

import com.kavya.studentdal.entity.Student;
import com.kavya.studentdal.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentdalApplicationTests {


	@Autowired
	private StudentRepository studentRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void testCreateStudent(){

		Student student =new Student();
		student.setName("John");
		student.setCourse("Science");
		student.setFees(30.0);
		studentRepository.save(student);
	}
	@Test
	void testFindStudentById(){
		Student student= studentRepository.findById(1L).get();
		System.out.println(student);
	}

	@Test
	void testUpdateStudent(){
		Student student= studentRepository.findById(1L).get();
		student.setFees(400.2);
		studentRepository.save(student);
	}


	@Test
	void  testDeleteStudent(){
		Student student= studentRepository.findById(1L).get();
		studentRepository.delete(student);
	}
}
