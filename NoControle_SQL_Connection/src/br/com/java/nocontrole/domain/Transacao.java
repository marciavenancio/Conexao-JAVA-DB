package br.com.java.nocontrole.domain;

import java.util.Date;

public class Transacao {
	private int codigo;
	private Date dataTransacao;
	private double valorTransacao;
	private int cdCategoria;
	private long cpf;
	

	public Transacao () {
		
	}
	
	public Transacao (int codigo, Date dataTransacao, double valorTransacao, int cdCategoria, long cpf ) {
		this.setCodigo(codigo);
		this.dataTransacao = dataTransacao;
		this.valorTransacao = valorTransacao;
		this.setCdCategoria(cdCategoria);
		this.cpf = cpf;
	}
	
	public Date getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	public double getValorTransacao() {
		return valorTransacao;
	}
	public void setValorTransacao(double valorTransacao) {
		this.valorTransacao = valorTransacao;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCdCategoria() {
		return cdCategoria;
	}

	public void setCdCategoria(int cdCategoria) {
		this.cdCategoria = cdCategoria;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

}
