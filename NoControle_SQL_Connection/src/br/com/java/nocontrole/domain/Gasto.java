package br.com.java.nocontrole.domain;

import java.util.Date;

public class Gasto extends Transacao {
	
	private String descricaoGasto;
	
	public Gasto(int codigo, Date dataTransacao, double valorTransacao, int cdCategoria, long cpf, String descricaoGasto) {
		super(codigo, dataTransacao, valorTransacao, cdCategoria, cpf);
		this.descricaoGasto = descricaoGasto;
	}
	
	public Gasto() {
		
	}
	public Gasto (String descricaoGasto) {
		this.descricaoGasto = descricaoGasto;
	}
	
	public String getDescricaoGasto() {
		return descricaoGasto;
	}
	public void setDescricaoGasto(String descricaoGasto) {
		this.descricaoGasto = descricaoGasto;
	}
	
		
}
