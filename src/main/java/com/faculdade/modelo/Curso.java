package com.faculdade.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCurso;
	@Column(name = "nome", length = 60, nullable = false)
	private String nome;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iddepartamento")
	private Departamento departamento;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idnivelescolaridade")
	private NivelEscolaridade nivelEscolaridade;
	
	

}
