package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	public TeacherRepository repository;

	
	
	public List<Teacher> FindAll() {
		List<Teacher> x=new ArrayList<>();
		for(Teacher member:repository.findAll()) {
			x.add(member);
		}
		return x;
	}

	
	public Teacher findOne(int id) {
		return this.repository.findOne(id);
	}
	
	public void save(Teacher member) {
		this.repository.save(member);
	}
	
	public void delete(int id) {
		this.repository.delete(id);
	}

}
