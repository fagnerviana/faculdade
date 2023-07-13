package com.faculdade.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.faculdade.modelo.NivelEscolaridade;
import com.faculdade.repository.NivelEscolaridadeRepository;
import com.faculdade.service.NivelEscolaridadeService;
import lombok.RequiredArgsConstructor;


//Aqui estremos implementando os metodos do NivelEscolaridade
@RequiredArgsConstructor
@Service
public class NivelEscolaridadeServiceImpl implements NivelEscolaridadeService{
	
	private final NivelEscolaridadeRepository nivelEscolaridadeRepository;

	@Override
	public NivelEscolaridade incluirNovoNivelEscolaridade(NivelEscolaridade novo) {
			return nivelEscolaridadeRepository.save(novo);
	}

	@Override
	public void excluirNivelEscolaridade(Long id) {
		
		NivelEscolaridade excluir = buscarNivelEscolaridade(id);
		if(excluir!=null) {
		
		   nivelEscolaridadeRepository.delete(excluir);
				
		}else {
			throw new IllegalArgumentException("Nivel Escolaridade não encontrado com o ID: "+id);
		}
	}

	@Override
	public NivelEscolaridade atualizarNivelEscolaridade( NivelEscolaridade escolaridade) {
		
		
		return nivelEscolaridadeRepository.save(escolaridade);
	}

	@Override
	public NivelEscolaridade buscarNivelEscolaridade(Long id) {
		return nivelEscolaridadeRepository.findById(id).orElseThrow(
				()->{
					throw new RuntimeException("Não existe Nivel Escolaridade com o ID informado: "+id);
				}
				
				);
	}

	@Override
	public List<NivelEscolaridade> listarNivelEscolaridade() {
		
		return nivelEscolaridadeRepository.findAll();
	}
	
	
	

}
