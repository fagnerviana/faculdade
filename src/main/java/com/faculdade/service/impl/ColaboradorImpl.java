package com.faculdade.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.faculdade.modelo.Colaborador;
import com.faculdade.repository.ColaboradorRepository;
import com.faculdade.service.ColaboradorService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ColaboradorImpl implements ColaboradorService{

	
	public final ColaboradorRepository colaboradorRepository;
	
	@Override
	public Colaborador incluirNovoColaborador(Colaborador colaborador) {
		return colaboradorRepository.save(colaborador);
	}

	@Override
	public void excluirColaboradorPorId(Long id) {
		Colaborador excluir = buscarColaboradorPorId(id);
		if(excluir!=null) {
			colaboradorRepository.deleteById(id);
		}else {
			throw new IllegalArgumentException("Colaborador não encontrado com o ID: "+id);
		}
		
	}

	@Override
	public Colaborador atualizaColaborador(Colaborador colaborador) {
		
		return colaboradorRepository.save(colaborador);
	}

	@Override
	public Colaborador buscarColaboradorPorId(Long id) {
		
		return colaboradorRepository.findById(id).orElseThrow(
				()->{
					throw new RuntimeException("Não existe Colaborador com o ID informado: "+id);
				}
				
				);
	}

	@Override
	public List<Colaborador> listarTodosColaborador() {
		
		return colaboradorRepository.findAll();
	}
	
	
	
	
}
