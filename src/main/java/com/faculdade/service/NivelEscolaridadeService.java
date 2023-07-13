package com.faculdade.service;

import java.util.List;
import com.faculdade.modelo.NivelEscolaridade;

public interface NivelEscolaridadeService {
	
	NivelEscolaridade incluirNovoNivelEscolaridade(NivelEscolaridade nivelEscolaridade);
	public void excluirNivelEscolaridade(Long id);
	NivelEscolaridade atualizarNivelEscolaridade(NivelEscolaridade escolaridade);
	NivelEscolaridade buscarNivelEscolaridade(Long id);
	List<NivelEscolaridade> listarNivelEscolaridade();

}
