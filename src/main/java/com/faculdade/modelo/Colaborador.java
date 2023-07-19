package com.faculdade.modelo;

import java.io.Serializable;

import com.faculdade.modelo.enums.StatusAtual;
import com.faculdade.modelo.enums.TipoFuncionario;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Colaborador implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idColaborador;
	
	@Column(name = "nome",length = 50,nullable = false)
	private String nome;
	@Column(name = "sobrenome",length = 50,nullable = false)
	private String sobrenome;
	@Column(name = "email",length = 50,nullable = false)
	private String email;
	@Column(name = "senha",length = 15,nullable = false)
	private String senha;
	
	//@JsonManagedReference
	@JsonBackReference
	@ManyToOne
    @JoinColumn(name = "idDepartamento")
	private Departamento departamento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status",length = 15,nullable = false)
	private StatusAtual status;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20,nullable = false)
	private TipoFuncionario tipoFuncionario;
	
	

}
