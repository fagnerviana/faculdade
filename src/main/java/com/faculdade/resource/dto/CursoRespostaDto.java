package com.faculdade.resource.dto;

import com.faculdade.modelo.Curso;
import lombok.Getter;

@Getter
public class CursoRespostaDto {
	
	private Long idCurso;
	private String nome;
	private String departamento;
	private String nivelEscolaridade;	
	
	
	public static CursoRespostaDto respostaDto(Curso curso) {
		return new CursoRespostaDto(
				//curso.getIdCurso(), 
				curso.getNome(),
				curso.getDepartamento().getNome(), 
				curso.getNivelEscolaridade().getNome()
				);
	}

	public CursoRespostaDto(Long idCurso, String nome, String departamento, String nivelEscolaridade) {
		super();
		this.idCurso = idCurso;
		this.nome = nome;
		this.departamento = departamento;
		this.nivelEscolaridade = nivelEscolaridade;
	}

	public CursoRespostaDto(String nome, String departamento, String nivelEscolaridade) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.nivelEscolaridade = nivelEscolaridade;
	}




}
