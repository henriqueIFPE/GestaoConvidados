package com.xtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xtech.model.ConvidadoDAO;

@Controller
public class ConvidadoController {

	@Autowired
	private ConvidadoDAO convidadodao;
	
	@GetMapping("/convidados")
	public String listar() {
		ModelAndView modelAndVeiw = new ModelAndView("ListaConvidados");
		
		modelAndVeiw.addObject("convidados", convidadodao.findAll());
		
		return "ListaConvidados";
	}
	
}
