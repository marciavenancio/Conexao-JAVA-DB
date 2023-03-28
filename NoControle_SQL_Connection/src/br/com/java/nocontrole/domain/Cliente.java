package br.com.java.nocontrole.domain;

import java.util.Calendar;

public class Cliente {
	
	private long cpf;
	private String nome;
	private Calendar dataNasc;
	private String email;
	private int telefone;
	private static double saldo;
	
	public Cliente () {
		
	}
	public Cliente(int cpf, String nome, Calendar dataNasc, String email, int telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.email = email;
		this.telefone = telefone;
		
	}
	
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getdataNasc() {
		return dataNasc;
	}
	public void setdataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	

	public static double getSaldo() {
		return saldo;
	}
	public static void setSaldo(double saldo) {
		saldo = Cliente.saldo;
	}


}
