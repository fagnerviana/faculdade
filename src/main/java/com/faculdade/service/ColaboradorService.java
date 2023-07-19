package com.faculdade.service;

import java.util.List;
import com.faculdade.modelo.Colaborador;


public interface ColaboradorService {
	
	Colaborador incluirNovoColaborador(Colaborador colaborador);
	public void excluirColaboradorPorId(Long id);
	Colaborador atualizaColaborador(Colaborador colaborador);
	Colaborador buscarColaboradorPorId(Long id);
	List<Colaborador> listarTodosColaborador();

}
