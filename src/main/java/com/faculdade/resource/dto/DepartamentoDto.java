package com.faculdade.resource.dto;



import com.faculdade.modelo.Departamento;
import lombok.Getter;

//@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class DepartamentoDto {
	
	private Long idDepartamento;
	private String nome;

	
	
	public Departamento transformaParaObjeto() {
		return new Departamento(nome);
	}
	
	public DepartamentoDto(String nome) {
		super();
		this.nome = nome;
	}

	public DepartamentoDto(Long idDepartamento, String nome) {
		super();
		this.idDepartamento = idDepartamento;
		this.nome = nome;
	}


	
	
}
