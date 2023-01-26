package com.kavya.studentdal.repository;

import com.kavya.studentdal.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
