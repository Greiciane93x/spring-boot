package br.com.studant.aplicacao.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.studant.aplicacao.modelo.Usuario;

public class UsuarioDto {

	private Long id;
	private String nome;
	private String email;
	private String cpf; 
	private LocalDate dataNascimento;
	
	public UsuarioDto(Usuario usuario) {
		this.id = usuario.getId(); 
		this.nome = usuario.getNome(); 
		this.email = usuario.getEmail(); 
		this.cpf = usuario.getCpf();
		this.dataNascimento = usuario.getDataNascimento();
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public static List<UsuarioDto> converter(List<Usuario> usuario) {
		return usuario.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
