package com.sri.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sri.firstproject.model.StudentModel;

@Repository
public interface StudentRep extends JpaRepository<StudentModel,Integer>{

}
