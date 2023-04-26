package com.sri.firstproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.firstproject.model.StudentModel;
import com.sri.firstproject.repository.StudentRep;

@Service
 
public class StudentService {

	@Autowired
	StudentRep studRep;
	
	public List <StudentModel>getAllStudent()
	{
		List<StudentModel>studList=studRep.findAll();
		return studList;
	}
	public StudentModel saveStudent(StudentModel s)
	{
		StudentModel obj = studRep.save(s);
		return obj;
	}
	public StudentModel updateStudent(StudentModel s)
	{
		StudentModel obj = studRep.save(s);
		return obj;
	}
	public void deleteStudent(int num)
	{
		studRep.deleteById(num);
	}
	public StudentModel getStudent(int num)
	{
		StudentModel s = studRep.findById(num).get();
		return s;
	}
}

