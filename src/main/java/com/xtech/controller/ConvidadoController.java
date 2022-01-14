package com.xtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xtech.dao.ConvidadoDAO;
import com.xtech.model.Convidado;

@Controller
public class ConvidadoController {

	@Autowired
	private ConvidadoDAO convidadodao;
	
	@GetMapping("/convidados")
	public String listar(Convidado convidado, ModelMap model ) {
	
		model.addAttribute("convidados", convidadodao.findAll());

		return "ListaConvidados";
	}
	
	@PostMapping("/salvarConvidado")
	public String salvarConvidado(Convidado convidado) {
		 this.convidadodao.save(convidado);
		return "redirect:/convidados";
		
	}
}
