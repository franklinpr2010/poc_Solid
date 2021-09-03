package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Funcionario  {
	private LocalDate dataUltimoReajuste;
	private DadosPessoais dadosPessoais;

	public Funcionario(DadosPessoais dadosPessoais, LocalDate dataUltimoReajuste) {
		this.setDadosPessoais(dadosPessoais);
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.getDadosPessoais().setSalario(novoSalario); 
		this.dataUltimoReajuste = LocalDate.now();

	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		this.getDadosPessoais().setCargo(novoCargo);
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

}
