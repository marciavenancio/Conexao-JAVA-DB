package br.com.java.nocontrole.teste;

import br.com.java.nocontrole.DAO.GastoDAO;
import br.com.java.nocontrole.domain.Gasto;

public class TesteInserirGasto {

	public static void main(String[] args) {
		GastoDAO dao = new GastoDAO();
		  
	      
	      Gasto gasto1 = new Gasto();
	      gasto1.setDataTransacao(new java.sql.Date(22,9,10));
	      gasto1.setValorTransacao(1000);
	      gasto1.setDescricaoGasto("Aluguel mês 09");
	      gasto1.setCpf (1112223332);
	      gasto1.setCdCategoria(6);
	      dao.incluirGasto(gasto1);
	  
	      System.out.println("Gasto Incluido!");
	      
	      Gasto gasto2 = new Gasto();
	      gasto2.setDataTransacao(new java.sql.Date(22,9,10));
	      gasto2.setValorTransacao(100);
	      gasto2.setDescricaoGasto("Mercado");
	      gasto2.setCpf (1112223332);
	      gasto2.setCdCategoria(1);
	      dao.incluirGasto(gasto2);
	  
	      System.out.println("Gasto Incluido!");
	      
	      Gasto gasto3 = new Gasto();
	      gasto3.setDataTransacao(new java.sql.Date(22,9,12));
	      gasto3.setValorTransacao(200);
	      gasto3.setDescricaoGasto("Gasolina");
	      gasto3.setCpf (1112223332);
	      gasto3.setCdCategoria(2);
	      dao.incluirGasto(gasto3);
	  
	      System.out.println("Gasto Incluido!");
	      

	      Gasto gasto4 = new Gasto();
	      gasto4.setDataTransacao(new java.sql.Date(22,9,15));
	      gasto4.setValorTransacao(500);
	      gasto4.setDescricaoGasto("Mensalidade Escola");
	      gasto4.setCpf (1112223332);
	      gasto4.setCdCategoria(3);
	      dao.incluirGasto(gasto4);
	  
	      System.out.println("Gasto Incluido!");
	      
	      Gasto gasto5 = new Gasto();
	      gasto5.setDataTransacao(new java.sql.Date(22,9,20));
	      gasto5.setValorTransacao(25);
	      gasto5.setDescricaoGasto("Netflix");
	      gasto5.setCpf (1112223332);
	      gasto5.setCdCategoria(4);
	      dao.incluirGasto(gasto5);
	  
	      System.out.println("Gasto Incluido!");

	}

}
