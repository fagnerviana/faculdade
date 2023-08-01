package com.faculdade.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.faculdade.modelo.Curso;
import com.faculdade.repository.CursoRepository;
import com.faculdade.service.CursoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CursoServiceImpl implements CursoService {
	
	
	private final CursoRepository cursoRepository;

	@Override
	public Curso buscarCursoPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso incluirCurso(Curso curso) {
		
		return cursoRepository.save(curso);
	}

	@Override
	public Curso atualizarCurso(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluirCursoPorId(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Curso> listarCursos() {
		// TODO Auto-generated method stub
		return null;
	}

}
