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

	@Override
	public Departamento atualizarDepartamento(Long id, String nome) {
		Departamento atualizar= new Departamento(id,nome);
		
		return departamentoRepository.save(atualizar);
	}

	@Override
	public Departamento incluirNovoDepartamento(Long id, String nome) {
		Departamento novo = new Departamento(id,nome);
		return departamentoRepository.save(novo);
	}

	@Override
	public void excluirDepartamento(Long id) {
		Departamento excluir = buscarDepartamento(id);
		departamentoRepository.deleteById(excluir.getIdDepartamento());
	}
	

}
