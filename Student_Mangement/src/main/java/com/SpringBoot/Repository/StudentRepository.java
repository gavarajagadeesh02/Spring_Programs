package com.SpringBoot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringBoot.Model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

	//void deleteById(int roll_no);

	//Iterable<Student> findAll();

	//void deleteById1(int roll_no);

	//void deleteById1(int roll_no);

}
