package com.faculdade.service;

import java.util.List;

import com.faculdade.modelo.Curso;

public interface CursoService {
	
	Curso buscarCursoPorId(Long id);
	Curso incluirCurso(Curso curso);
	Curso atualizarCurso(Curso curso);
	public void excluirCursoPorId(Long id);
	List<Curso> listarCursos();
}
