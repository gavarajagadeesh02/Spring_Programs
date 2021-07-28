package com.SpringBoot.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SpringBoot.Model.Student;
import com.SpringBoot.Repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents()
	{
		List<Student> student = new ArrayList<Student>();
		studentRepository.findAll().forEach(student1 -> student.add(student1));
		return student;
		
	}
	
	public Student getStudentById(int roll_no)
	{
		return studentRepository.findById(roll_no).get();
	}
	public void saveOrUpdate(Student student)
	{
		studentRepository.save(student);
		
	}
	public void delete(int roll_no)
	{
		studentRepository.deleteById(roll_no);
	}
	public void update(Student student,int roll_no)
	{
		studentRepository.save(student);
	}
	
	
	
}
