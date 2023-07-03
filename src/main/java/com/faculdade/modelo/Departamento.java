package com.faculdade.modelo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Departamento implements Serializable {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long iddepartamento;
	
	@Column(name = "nome",length =50,nullable = false)
	private String nome;
	
	

}
