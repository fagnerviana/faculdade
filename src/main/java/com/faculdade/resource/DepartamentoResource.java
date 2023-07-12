package com.faculdade.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faculdade.modelo.Departamento;
import com.faculdade.service.DepartamentoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/departamento")
@RequiredArgsConstructor
public class DepartamentoResource {
	
	
	private final DepartamentoService departamentoservice;
	
			
	@GetMapping("/{id}")
	public Departamento buscarDepartamento(@PathVariable("id") Long id) {
		return departamentoservice.buscarDepartamento(id);
	}
	
	@GetMapping("/listar")
	public List<Departamento> listarDepartamentos() {
		return departamentoservice.listarDepartamento();
	}
	
	@PutMapping("/{Departamento}")
	public Departamento atualizarDepartamento( Long id, String nome) {
		return departamentoservice.atualizarDepartamento(id,nome);
	}
	
}
