package com.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.modelo.NivelEscolaridade;

@Repository
public interface NivelEscolaridadeRepository extends JpaRepository<NivelEscolaridade, Long> {

}
