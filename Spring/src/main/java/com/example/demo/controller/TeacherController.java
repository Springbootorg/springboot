package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Teacher;
import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import com.example.demo.service.UniversityService;

@Controller
public class TeacherController {
	
	@Autowired
	private TeacherService service;
	
	@GetMapping("/teacher")
	public String home(Model model) {
		model.addAttribute("teacher", new Teacher());
		List<Teacher> unies=service.FindAll();
		model.addAttribute("teachers", unies);
		return "teacher";
	}
	@PostMapping("/teacher/add")
	public String showUni(@ModelAttribute("teacher")Teacher university) {
		service.save(university);
		return"redirect:/teacher";

	}
	@RequestMapping(value="/teacher/edit/{id}")
	public String editMember(@PathVariable("id") int id,Model model) {
		Teacher uni=service.findOne(id);
		model.addAttribute("teacher",uni);
		return "teacher";
	}
	
	@RequestMapping(value="/teacher/delete/{id}")
	public String deleteMember(@PathVariable("id") int id,Model model) {
		service.delete(id);
		model.addAttribute("teacher", new Teacher());
		List<Teacher> unies=service.FindAll();
		model.addAttribute("teachers", unies);
		return"teacher";
	}
	
}
