package com.sri.firstproject.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sri.firstproject.model.StudentModel;
import com.sri.firstproject.service.StudentService;

@RestController

public class StudentController {
  
	@Autowired
	StudentService sri;
	@GetMapping ("/display")
	public List<StudentModel> getAllStudents()
	{
		List<StudentModel> studList=sri.getAllStudent();
		return studList;
	}
	@PostMapping("/add")
	public StudentModel saveStudent(@RequestBody StudentModel s)
	{
		return sri.saveStudent(s);
	}
	@PutMapping("/update")
	public StudentModel updateStudent(@RequestBody StudentModel s)
	{
		return sri.updateStudent(s);
	}
	@DeleteMapping(value="/deleteStudent/{rno}")
	public void  deleteStudent(@PathVariable("rno") int num)
	{
		sri.deleteStudent(num);
	}
}
