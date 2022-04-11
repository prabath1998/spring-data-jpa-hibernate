package com.example.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
 