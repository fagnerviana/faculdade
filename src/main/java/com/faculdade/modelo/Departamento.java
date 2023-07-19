package com.faculdade.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Departamento implements Serializable {
	
	//Atributos
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDepartamento;
	
	//coluna da tabela com os seus detalhes
	@Column(name = "nome",length =50,nullable = false)
	private String nome;
	
	//@JsonBackReference
	@JsonManagedReference
	@OneToMany(mappedBy="departamento",cascade = CascadeType.ALL)
	private List<Colaborador>colaboradores= new ArrayList<>();

	public Departamento(Long idDepartamento, String nome) {
		super();
		this.idDepartamento = idDepartamento;
		this.nome = nome;
	}
	
	

	
}
