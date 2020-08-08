package com.speech.tmt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.speech.tmt.dao.ClientRepository;
import com.speech.tmt.dao.EmployeeRepository;
import com.speech.tmt.entities.Client;
import com.speech.tmt.entities.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	ClientRepository clientRepo;
	
	@GetMapping
	public String displayEmployees(Model model) {
		List<Employee> employees = empRepo.findAll();
		model.addAttribute("employees", employees);
		return "employees/employees-table";
	}

	@GetMapping("/new")
	public String displayEmployeeForm(Model model) {
		Employee employee = new Employee();
		List<Client> clients = clientRepo.findAll();
		model.addAttribute("employee", employee);
		model.addAttribute("allClients", clients);
		return "employees/new-employee"; 
	}
	
	@PostMapping(path="/save")
	public String createEmployee(Employee employee, BindingResult bindingResult, Model model) {
		//this saves client to the database
		empRepo.save(employee);
		
		//user redirect to prevent duplicate submissions 
		return "redirect:/employee";
	}
	
	

}
