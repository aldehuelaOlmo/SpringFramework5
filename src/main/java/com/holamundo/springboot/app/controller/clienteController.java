package com.holamundo.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.holamundo.springboot.app.repository.IClientRepository;

@Controller
public class clienteController {

	@Autowired
	private IClientRepository clientRepository;
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Lista de clientes");
		model.addAttribute("clientes", clientRepository.FindAll());
		return "listar";
	}
}
