package br.senac.pr.agendaSenac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.senac.pr.agendaSenac.entities.Funcionario;
import br.senac.pr.agendaSenac.repositories.FuncionarioRepository;

@Controller
public class FuncionarioController {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@GetMapping("/form")
	public String formFuncionario(Funcionario funcionario) {	
	
		return "addFuncionario";
		
		
	}

}
