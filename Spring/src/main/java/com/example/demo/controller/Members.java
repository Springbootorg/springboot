package com.example.demo.controller;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;

@Controller
public class Members {


	@Autowired
	private MemberService service;
	


	@GetMapping("/member/add")
	public String loginHome( Model model) {
		model.addAttribute("member",new Member());
		List<Member> allMem=service.FindAll();
		model.addAttribute("members", allMem);
		return "sinup";
	}
	
	@PostMapping("/member/add")
	public String addUser(@ModelAttribute("member")Member member) {
		service.save(member);
		return "redirect:/member/add";
	}
	
	@GetMapping("/login")
	public String loginUser(Model model) {
		model.addAttribute("user", new Member());
		
		return "login";
	}
	
	@PostMapping("/login")
	public String loginUser(@ModelAttribute("user") Member member,Model model) {
		  Member temp=service.findByUserName(member.getUsername());
			if(temp==null) {
				model.addAttribute("message","your password are incorect");
				return "redirect:/login";
			}
			else if(temp.getPassword().equals(member.getPassword())) {
				return "redirect:/home";
			}
			else {
				model.addAttribute("message","your password are incorect");
				return "/login";
	}
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
}
