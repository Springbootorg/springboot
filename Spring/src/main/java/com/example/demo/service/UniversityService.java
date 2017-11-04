package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.University;
import com.example.demo.repository.UniversityRepository;

@Service
public class UniversityService {

	@Autowired
	private UniversityRepository repository;
	
	public List<University> FindAll() {
		List<University> x=new ArrayList<>();
		for(University member:repository.findAll()) {
			x.add(member);
		}
		return x;
	}
	
	public University findOne(int id) {
		return this.repository.findOne(id);
	}
	
	public void save(University member) {
		repository.save(member);
	}
	
	public void delete(int id) {
		this.repository.delete(id);
	}
}
