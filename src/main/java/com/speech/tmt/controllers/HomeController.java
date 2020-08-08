package com.speech.tmt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.speech.tmt.dao.ClientRepository;
import com.speech.tmt.dao.EmployeeRepository;
import com.speech.tmt.entities.Client;
import com.speech.tmt.entities.Employee;

@Controller
public class HomeController {
	
	@Autowired
	ClientRepository clientRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) {
		List<Client> clients = clientRepo.findAll();
		model.addAttribute("clients", clients);
		
		
		List<Employee> employees = empRepo.findAll();
		model.addAttribute("employees", employees);
		
		
		return "main/home";
	}

}
