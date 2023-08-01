package com.faculdade.resource.dto;

import java.io.Serializable;

import com.faculdade.modelo.Curso;
import com.faculdade.modelo.Departamento;
import com.faculdade.modelo.NivelEscolaridade;

import lombok.Getter;

@Getter
public class CursoDto  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idCurso;
	private String nome;
	private Departamento departamento;
	private NivelEscolaridade nivelEscolaridade;
	
	//Aqui podemos criar os contrutores com as assinaturas precisamos
	public CursoDto(String nome, Departamento departamento, NivelEscolaridade nivelEscolaridade) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.nivelEscolaridade = nivelEscolaridade;
	}
	public CursoDto(Long idCurso, String nome) {
		super();
		this.idCurso = idCurso;
		this.nome = nome;
	}
	public CursoDto(String nome, NivelEscolaridade nivelEscolaridade) {
		super();
		this.nome = nome;
		this.nivelEscolaridade = nivelEscolaridade;
	}
	
	public Curso transformarParaObj() {
		
		return new Curso(nome,departamento,nivelEscolaridade);
	}
		
	
}
