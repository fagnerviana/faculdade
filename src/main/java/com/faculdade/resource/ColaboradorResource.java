package com.faculdade.resource;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.faculdade.modelo.Colaborador;
import com.faculdade.service.ColaboradorService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;


@Api(value ="/colaborador")
@RestController
@RequestMapping("/colaborador")
@RequiredArgsConstructor
public class ColaboradorResource {
	
	private final ColaboradorService colaboradorService;

	@PostMapping("/novo")
	public ResponseEntity<Colaborador> criarNovoColaborador(@RequestBody Colaborador colaborador){
		Colaborador criarnovo = colaboradorService.incluirNovoColaborador(colaborador);
		
		return new ResponseEntity<>(criarnovo,HttpStatus.CREATED);
	}
	
	@GetMapping("listartodos")
	public ResponseEntity<List<Colaborador>> listarTodosColaborador(){
		List<Colaborador> listaColaboradores = colaboradorService.listarTodosColaborador();
		return new ResponseEntity<>(listaColaboradores, HttpStatus.OK);
		
	}
	
	
	
}
