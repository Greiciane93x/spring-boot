package br.com.studant.aplicacao.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.studant.aplicacao.modelo.Vacina;

public class VacinaDto {
	

	private Long id;
	private String nomeVacina;
	private String emailUsuario;
	private LocalDate dataVacina;
	
	public VacinaDto(Vacina vacina) {

		this.id = vacina.getId(); 
		this.nomeVacina = vacina.getNomeVacina(); 
		this.emailUsuario = vacina.getEmailUsuario(); 
		this.dataVacina = vacina.getDataVacina(); 
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	
	public LocalDate getDataVacina() {
		return dataVacina;
	}

	public void setDataVacina(LocalDate dataVacina) {
		this.dataVacina = dataVacina;
	}

	public static List<VacinaDto> converter(List<Vacina> vacina) {
		return vacina.stream().map(VacinaDto::new).collect(Collectors.toList());
	}

	
	
	

}
