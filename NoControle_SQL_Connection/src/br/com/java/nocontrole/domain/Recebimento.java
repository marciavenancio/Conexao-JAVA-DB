package br.com.java.nocontrole.domain;

import java.util.Date;

public class Recebimento extends Transacao {
	
	private String descricaoRecebimento;
	
	public Recebimento(int codigo, Date dataTransacao, double valorTransacao, int cdCategoria, long cpf, String descricaoRecebimento) {
		super();
	}

	public Recebimento () {
		
	}
	
	public Recebimento (String descricaoRecebimento) {
		this.descricaoRecebimento = descricaoRecebimento;
	}
	
	public String getDescricaoRecebimento() {
		return descricaoRecebimento;
	}

	public void setDescricaoRecebimento(String descricaoRecebimento) {
		this.descricaoRecebimento = descricaoRecebimento;
	}
	

}
