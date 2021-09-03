package br.com.alura.rh.model;

public class Terceirizado {
	
	private String empresa;
	private DadosPessoais dadosPessoais;

	public Terceirizado(DadosPessoais dadosPessoais, String empresa) {
		this.dadosPessoais = new DadosPessoais(dadosPessoais.getNome(), dadosPessoais.getCpf(), 
				dadosPessoais.getCargo(), dadosPessoais.getSalario());
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

}
