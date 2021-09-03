package br.com.alura.rh.service;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.DadosPessoais;
import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;

	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	public void reajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
	
	
	
	public static void main(String[] args) {
		List<ValidacaoReajuste> validacoes = new ArrayList<ValidacaoReajuste>();
		validacoes.add(new ValidacaoPeriodicidadeEntreReajuste());
		validacoes.add(new ValidacaoPercentualReajuste());
		ReajusteService reajusteService = new ReajusteService(validacoes);
		Funcionario funcionario = new Funcionario(new DadosPessoais("Franklin", "09034040798", Cargo.ASSISTENTE, new BigDecimal(100)), LocalDate.now());
		reajusteService.reajustarSalarioFuncionario(funcionario,  new BigDecimal("10000"));
		System.out.println(funcionario.getDadosPessoais().getNome());
		System.out.println(funcionario.getDadosPessoais().getCpf());
		System.out.println(funcionario.getDadosPessoais().getSalario());
	
	}
}
