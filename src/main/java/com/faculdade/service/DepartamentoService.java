package com.faculdade.service;

import java.util.List;

import com.faculdade.modelo.Departamento;

public interface DepartamentoService {
	
	Departamento incluirNovoDepartamento(Departamento departamento);
	Departamento excluirDepartamento(Long id);
	Departamento atualizarDepartamento(Departamento departamento);
	Departamento buscarDepartamento(Long id);
	List<Departamento> listarDepartamento();
	
}
