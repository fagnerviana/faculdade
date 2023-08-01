package com.faculdade.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faculdade.modelo.Curso;
import com.faculdade.resource.dto.CursoDto;
import com.faculdade.resource.dto.CursoRespostaDto;
import com.faculdade.service.CursoService;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api(value ="/curso")
@RestController
@RequestMapping("/curso")
@RequiredArgsConstructor
public class CursoResource {
	
	private final CursoService cursoService;
	
	
	@PostMapping("/novodto")
	public ResponseEntity<CursoRespostaDto> incluirNovoCurso(@RequestBody CursoDto dto){
		Curso curso= cursoService.incluirCurso(dto.transformarParaObj());
		
		return new ResponseEntity<>(CursoRespostaDto.respostaDto(curso),HttpStatus.CREATED);
	}
	
	@PostMapping("/novo")
	public ResponseEntity<Curso> incluirNovo(@RequestBody Curso curso){
		Curso novo=cursoService.incluirCurso(curso);
		
		return new ResponseEntity<>(novo,HttpStatus.CREATED);
	}
	
}
