package com.faculdade.resource.dto;

import com.faculdade.modelo.Colaborador;
import com.faculdade.modelo.Departamento;
import com.faculdade.modelo.enums.StatusAtual;
import com.faculdade.modelo.enums.TipoFuncionario;


import lombok.Getter;


@Getter
public class ColaboradorDto {
	
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private Departamento departamento;
	private StatusAtual status;
	private TipoFuncionario tipoFuncionario;
		
	//Aqui podemos criar os contrutores com as assinaturas precisamos
	public ColaboradorDto (String nome,String sobrenome,String email) {
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.email=email;
	}
			
	//Este metodo serve para criar as informações que recebo do POSTMAPPING do ColaboradorResource/novo
	public Colaborador transformaParaObjeto() {
		return new Colaborador(nome,sobrenome,email,senha,departamento,status,tipoFuncionario);
	}
		
}
