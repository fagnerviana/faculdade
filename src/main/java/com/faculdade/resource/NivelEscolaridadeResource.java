package com.faculdade.resource;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faculdade.modelo.NivelEscolaridade;
import com.faculdade.service.NivelEscolaridadeService;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api(value ="/nivelescolaridade")
@RestController
@RequestMapping("/nivelescolaridade")
@RequiredArgsConstructor
public class NivelEscolaridadeResource {
	
	public final NivelEscolaridadeService nivelEscolaridadeService;
	
	@PostMapping("/novo")
	public ResponseEntity<NivelEscolaridade> incluirNovoNivelEscolaridade(@RequestBody NivelEscolaridade novo) {
		NivelEscolaridade criarnovo = nivelEscolaridadeService.incluirNovoNivelEscolaridade(novo);
		return new ResponseEntity<>(criarnovo, HttpStatus.CREATED);
				
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<NivelEscolaridade> buscarPeloId(@PathVariable("id") Long id) {
        NivelEscolaridade example = nivelEscolaridadeService.buscarNivelEscolaridade(id);
        if (example != null) {
            return new ResponseEntity<>(example, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	@GetMapping
	public ResponseEntity<List<NivelEscolaridade>> listarNivelEscolaridade(){
		List<NivelEscolaridade> listaEscolaridade = nivelEscolaridadeService.listarNivelEscolaridade();
		return new ResponseEntity<>(listaEscolaridade, HttpStatus.OK);
		
	}
	
	@PutMapping("/{atualizarnome}")
	public ResponseEntity<NivelEscolaridade> atualizarNivelEscolaridade(@PathVariable("id") Long id, @RequestBody NivelEscolaridade escolaridade){
		
		NivelEscolaridade atualizar = nivelEscolaridadeService.buscarNivelEscolaridade(id);
		if(atualizar!=null) {
		escolaridade.setIdNivelEscolaridade(id);
		NivelEscolaridade update = nivelEscolaridadeService.atualizarNivelEscolaridade(escolaridade);
		return new ResponseEntity<>(update,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);			
		}
		
	}
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExample(@PathVariable("id") Long id) {
        NivelEscolaridade example = nivelEscolaridadeService.buscarNivelEscolaridade(id);
        if (example != null) {
            nivelEscolaridadeService.excluirNivelEscolaridade(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	

}
