package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel{
	
	private BigDecimal valor;
	private LocalDate data;
	
	public Promocao(BigDecimal valor) {
		this.data = LocalDate.now();
		this.valor = valor;
	}
	

	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}

	@Override
	public BigDecimal valorImposto() {
		return valor.multiply(new BigDecimal("0.1"));
	}


 
}
