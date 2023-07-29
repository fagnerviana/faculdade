package com.faculdade.service;

import java.util.List;

import com.faculdade.modelo.Departamento;


public interface DepartamentoService {
	
	Departamento incluirNovoDepartamento(Departamento dpt);
	public void excluirDepartamento(Long id);
	Departamento atualizarDepartamento(Long id, String nome);
	Departamento buscarDepartamento(Long id);
	List<Departamento> listarDepartamento();
	
	
}
