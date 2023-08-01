package com.faculdade.modelo;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
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
	//@JsonManagedReference
	//@OneToMany(mappedBy="departamento",cascade = CascadeType.ALL)
	//private List<Colaborador>colaboradores= new ArrayList<>();

	//Para atender o DTO retornar somente o nome do departamento
	public Departamento(String nome) {
		// TODO Auto-generated constructor stub
	}

	
}
