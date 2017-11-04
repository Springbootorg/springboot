package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	public MemberRepository repository;

	
	
	public List<Member> FindAll() {
		List<Member> x=new ArrayList<>();
		for(Member member:repository.findAll()) {
			x.add(member);
		}
		return x;
	}
	public Member findByUserName(String first_name) {
		return repository.findByUsername(first_name);
	}
	
	public Member findOne(int id) {
		return this.repository.findOne(id);
	}
	
	public void save(Member member) {
		this.repository.save(member);
	}
	
	public void delete(int id) {
		this.repository.delete(id);
	}
	
}