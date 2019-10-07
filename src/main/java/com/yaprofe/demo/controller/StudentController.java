package com.yaprofe.demo.controller;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yaprofe.demo.model.Estudiante;
import com.yaprofe.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentForm")
	public String studentForm(Model model) {
		Estudiante student = new Estudiante();
		model.addAttribute("student", student);
		return ("studentForm");
	}
	
	@PostMapping("/save")
	public String saveCustomer(@Valid Estudiante estudiante, Model model) {
		studentService.save(estudiante);
		return "redirect:/student/studentList";
	}

	@GetMapping("/studentList")
	public String form(Model model) {
		model.addAttribute("students", studentService.listAll());
		return "studentList";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable(name = "id") int id) {
		System.out.println(id);
	    studentService.delete(id);
	    return "redirect:/student/studentList";     
	}
	
	@GetMapping("/studentForm/{id}")
	public String Showsave(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("student", studentService.getId(id));
		}else {
			model.addAttribute("student", new Estudiante());
		}
		return "studentForm";
	}

}
