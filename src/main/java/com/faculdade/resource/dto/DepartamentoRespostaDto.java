package com.faculdade.resource.dto;


import com.faculdade.modelo.Departamento;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DepartamentoRespostaDto {
	
	private String nome;

	
	public DepartamentoRespostaDto() {
		
	}
	
	public static DepartamentoRespostaDto respostaDto(Departamento dpt) {
		return new DepartamentoRespostaDto(
				dpt.getNome()
				);
	}
	
	
	public static DepartamentoRespostaDto transformaEmDTO(Departamento dpt) {
	    return new DepartamentoRespostaDto(dpt.getNome());
	}

	public DepartamentoRespostaDto(Departamento obj) {
		// TODO Auto-generated constructor stub
	}
	

}
