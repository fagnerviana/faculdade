package com.faculdade.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@DeleteMapping("/{deletar}")
	public Departamento excluirDepartamento(Long id) {
		departamentoservice.excluirDepartamento(id);
		return null;
	}
	@PostMapping
	public Departamento incluirNovoDepartamento(@RequestBody Long id, String nome) {
		
		return departamentoservice.incluirNovoDepartamento(id, nome);
		
	}
	
}
