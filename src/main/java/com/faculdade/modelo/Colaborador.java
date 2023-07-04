package com.faculdade.modelo;

import java.io.Serializable;

import com.faculdade.modelo.enums.StatusAtual;
import com.faculdade.modelo.enums.TipoFuncionario;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
	private long idProfessor;
	
	@Column(length = 50,nullable = false)
	private String nome;
	@Column(length = 50,nullable = false)
	private String sobrenome;
	@Column(length = 50,nullable = false)
	private String email;
	@Column(length = 15,nullable = false)
	private String senha;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iddepartamento")
	private Departamento departamento;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 15,nullable = false)
	private StatusAtual status;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20,nullable = false)
	private TipoFuncionario tipoFuncionario;
	
	

}
