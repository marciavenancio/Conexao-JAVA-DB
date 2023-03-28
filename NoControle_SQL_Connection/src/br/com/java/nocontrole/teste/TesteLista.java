package br.com.java.nocontrole.teste;


import java.util.List;

import br.com.java.nocontrole.DAO.GastoDAO;
import br.com.java.nocontrole.domain.Gasto;


public class TesteLista {

	public static void main(String[] args) {
		GastoDAO dao = new GastoDAO();
	      
	      List<Gasto> lista = dao.listar();
	      for (Gasto item : lista) {
	        System.out.println(item.getCodigo() + " " + item.getDataTransacao() + " " + item.getValorTransacao() + " " + item.getDescricaoGasto() 
	        + " " + item.getCpf() + " " + item.getCdCategoria());
	      }
	}

}
