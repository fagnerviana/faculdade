package com.faculdade.resource.dto;


import com.faculdade.modelo.Colaborador;

import lombok.Getter;

//@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ColaboradorRespostaDto {
	
	
	private Long idColaborador;
	private String nome;
	private String sobrenome;
	private String email;
	private String departamento;
	private String status;
	private String tipoFuncionario;
	
	public static ColaboradorRespostaDto respostaDto(Colaborador colaborador) {
		return new ColaboradorRespostaDto(
				colaborador.getNome(), 
				colaborador.getSobrenome(),
				colaborador.getEmail(),
				colaborador.getStatus().name(), 
				colaborador.getTipoFuncionario().name(), 
			    colaborador.getDepartamento().getNome());
	}
			
	public ColaboradorRespostaDto(String nome, String sobrenome, String email, String departamento, String status,
			String tipoFuncionario) {
	
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.departamento = departamento;
		this.status = status;
		this.tipoFuncionario = tipoFuncionario;
	}
		

}
