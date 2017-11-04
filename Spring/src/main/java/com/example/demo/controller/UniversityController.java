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

import com.example.demo.model.University;
import com.example.demo.service.UniversityService;

@Controller
public class UniversityController {

	@Autowired
	private UniversityService service;
	
	@GetMapping("/university")
	public String home(Model model) {
		model.addAttribute("uni", new University());
		List<University> unies=service.FindAll();
		model.addAttribute("universities", unies);
		return "university";
	}
	@PostMapping("/university")
	public String showUni(@ModelAttribute("uni")University university) {
		service.save(university);
		return"redirect:/university";

	}
	@RequestMapping(value="/member/edit/{id}")
	public String editMember(@PathVariable("id") int id,Model model) {
		University uni=service.findOne(id);
		model.addAttribute("uni",uni);
		return "university";
	}
	@RequestMapping(value="/member/delete/{id}")
	public String deleteMember(@PathVariable("id") int id,Model model) {
		service.delete(id);
		model.addAttribute("uni", new University());
		List<University> unies=service.FindAll();
		model.addAttribute("universities", unies);
		return"university";
	}
}
