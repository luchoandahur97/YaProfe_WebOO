package com.yaprofe.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yaprofe.demo.model.Profesor;
import com.yaprofe.demo.service.SpecialtyService;
import com.yaprofe.demo.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	@Autowired
	private SpecialtyService specialtyService;
	
	@GetMapping("/teacherForm")
	public String teacherForm(Model model) {
		Profesor teacher = new Profesor();
		model.addAttribute("teacher", teacher);
		model.addAttribute("specialties", specialtyService.listAll());
		return ("teacherForm");
	}
	
	@PostMapping("/save")
	public String saveCustomer(@Valid Profesor profesor, Model model) {
		teacherService.save(profesor);
		return "redirect:/teacher/teacherList";
	}
	@GetMapping(value = "/teacherForm/{id}")
	public String Showsave(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("teacher", teacherService.getId(id));
			model.addAttribute("specialties", specialtyService.listAll());
			
		}else {
			model.addAttribute("teacher", new Profesor());
			model.addAttribute("specialties", specialtyService.listAll());
			System.out.println(specialtyService.listAll());
		}
		return "teacherForm";
	}
	
	@GetMapping("/teacherList")
	public String form(Model model) {
		model.addAttribute("teachers", teacherService.listAll());
		return "teacherList";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable(name = "id") int id) {
	    teacherService.delete(id);
	    return "redirect:/teacher/teacherList";     
	}
}
