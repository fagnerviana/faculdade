package com.faculdade.resource;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.faculdade.modelo.Colaborador;
import com.faculdade.resource.dto.ColaboradorDto;
import com.faculdade.resource.dto.ColaboradorRespostaDto;
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
	public ResponseEntity<ColaboradorRespostaDto> criarNovoColaborador(@RequestBody ColaboradorDto dto){
		Colaborador criarnovo = colaboradorService.incluirNovoColaborador(dto.transformaParaObjeto());
		
		return new ResponseEntity<>(ColaboradorRespostaDto.respostaDto(criarnovo),HttpStatus.CREATED);
	}
	
	@GetMapping("listartodos")
	public ResponseEntity<List<Colaborador>> listarTodosColaborador(){
		List<Colaborador> listaColaboradores = colaboradorService.listarTodosColaborador();
		return new ResponseEntity<>(listaColaboradores, HttpStatus.OK);
		
	}
	
	@GetMapping("{iddto}")
	public ResponseEntity<ColaboradorRespostaDto> buscarPorId(@PathVariable("iddto") Long id ){
		Colaborador colaborador = colaboradorService.buscarColaboradorPorId(id);
		return new ResponseEntity<>(ColaboradorRespostaDto.respostaDto(colaborador),HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Colaborador> id(@PathVariable("id") Long id ){
		Colaborador colaborador = colaboradorService.buscarColaboradorPorId(id);
		return new ResponseEntity<>(colaborador,HttpStatus.OK);
	}
	
	
	
}
