package com.faculdade.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faculdade.modelo.Departamento;
import com.faculdade.repository.DepartamentoRepository;
import com.faculdade.service.DepartamentoService;

import lombok.RequiredArgsConstructor;

//Aqui estremos implementando os metodos do Departamento
@RequiredArgsConstructor
@Service
public class DepartamentoServiceImpl implements DepartamentoService{
	
	//realizar a injeção de dependência automaticamente. 
	//Ela marca um ponto de injeção em uma classe e permite que o Spring resolva e forneça a instância adequada 
	//de uma dependência.
	private final DepartamentoRepository departamentoRepository;
	@Autowired
	public DepartamentoServiceImpl(DepartamentoRepository departamentoRepository) {
		this.departamentoRepository= departamentoRepository;
	}
	
	
	@Override
	public Departamento incluirNovoDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}

	@Override
	public Departamento excluirDepartamento(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento atualizarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento buscarDepartamento(Long id) {
		return departamentoRepository.findById(id).orElseThrow(
				()->{
					throw new RuntimeException("Não existe departamento com o ID informado");
				}
				
				);
	}

	@Override
	public List<Departamento> listarDepartamento() {
		return departamentoRepository.findAll();
	}
	

}
