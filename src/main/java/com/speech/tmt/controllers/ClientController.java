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
import com.speech.tmt.entities.Client;

@Controller
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	ClientRepository clientRepo;


	@GetMapping
	public String displayClients(Model model) {
		List<Client> clients = clientRepo.findAll();
		model.addAttribute("clients", clients);
		return "clients/clients-table";
	}

	@GetMapping("/new")
	public String displayClientForm(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "clients/new-client";
	}

	@PostMapping("/save")
	public String createClient(Client client,BindingResult bindingResult, Model model) {
		// this saves client to the database
		clientRepo.save(client);
		// user redirect to prevent duplicate submissions
		return "redirect:/clients/new";
	}

}
