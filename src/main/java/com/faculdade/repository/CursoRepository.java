package com.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.modelo.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
	

}
