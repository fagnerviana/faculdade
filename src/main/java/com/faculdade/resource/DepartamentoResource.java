package com.faculdade.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faculdade.modelo.Departamento;
import com.faculdade.resource.dto.DepartamentoDto;
import com.faculdade.resource.dto.DepartamentoRespostaDto;
import com.faculdade.service.DepartamentoService;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api(value ="com.faculdade/departamento")
@RestController
@RequestMapping("/departamento")
@RequiredArgsConstructor
public class DepartamentoResource {
	
	
	private final DepartamentoService departamentoservice;
	
			
	@GetMapping("/{id}")
	public ResponseEntity<DepartamentoDto> buscarDepartamento(@PathVariable("id") Long id) {
		Departamento departamento = departamentoservice.buscarDepartamento(id);
		DepartamentoDto dto= new DepartamentoDto(departamento.getIdDepartamento(),departamento.getNome());
		return new ResponseEntity<>(dto, HttpStatus.OK);
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
	
	@PostMapping("/novo")
	public ResponseEntity<DepartamentoRespostaDto> incluirNovoDepartamento(@RequestBody DepartamentoDto dpdto) {
		Departamento novo = departamentoservice.incluirNovoDepartamento(dpdto.transformaParaObjeto());
		
		return new ResponseEntity<>(DepartamentoRespostaDto.transformaEmDTO(novo), HttpStatus.CREATED);
		
	}
	
}
