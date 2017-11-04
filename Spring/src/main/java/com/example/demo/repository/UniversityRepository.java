package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.University;

@Repository
public interface UniversityRepository extends CrudRepository<University,Integer> {

}
