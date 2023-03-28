package br.com.java.nocontrole.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBM {
	public static Connection obterConexao() {
		Connection conexao = null;
	      try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        conexao = DriverManager.getConnection(
	            "jdbc:oracle:thin:@oracle.", "Username", "Password");
	        System.out.println("DB Conectado!");
	        
	      } catch (Exception e) {
		        System.err.println("Não foi possível conectar no Banco de Dados");
		        e.printStackTrace();
		      } 
		return conexao;

}
}
