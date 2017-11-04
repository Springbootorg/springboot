package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Integer>{

	public Member findByUsername(String first_name);
}
