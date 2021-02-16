package br.com.studant.aplicacao.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.studant.aplicacao.controller.dto.UsuarioDto;
import br.com.studant.aplicacao.controller.dto.VacinaDto;
import br.com.studant.aplicacao.modelo.Usuario;
import br.com.studant.aplicacao.modelo.Vacina;
import br.com.studant.aplicacao.repository.UsuarioRepository;
import br.com.studant.aplicacao.repository.VacinaRepository;

@RestController
@RequestMapping()
public class UsuariosController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private VacinaRepository vacinaRepository;
	
	@GetMapping("/listarUsuarios")
	public List<UsuarioDto> listaUsuario() {
			List<Usuario> usuarios = usuarioRepository.findAll();
			return UsuarioDto.converter(usuarios);
	}
	
    @PostMapping("/cadastrarUsuario")
    ResponseEntity<String> cadatrarUsuario(@Valid @RequestBody Usuario usuario) {
    	
    	 usuarioRepository.save(usuario); 
    	
        return ResponseEntity.ok("Usuário cadastrado com sucesso!");
    }
    
    
    @GetMapping("/listarVacinas")
    public List<VacinaDto> cadastrarVacinas(){
    	List<Vacina> vacinas = vacinaRepository.findAll(); 
    	return VacinaDto.converter(vacinas); 
    	
    }
    
    @PostMapping("/cadastrarVacina")
    ResponseEntity<String> cadastrarVacinas(@Valid @RequestBody Vacina vacina){
    	
    	vacinaRepository.save(vacina); 
    	return ResponseEntity.ok("Vacina Cadastrada com sucesso!") ; 
    }

    
    
}
