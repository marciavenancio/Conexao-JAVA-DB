package br.com.java.nocontrole.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.java.nocontrole.domain.Gasto;
import br.com.java.nocontrole.jdbc.OracleDBM;

public class GastoDAO {
	
	private static Connection conexao;
	public void incluirGasto (Gasto gasto) {
		PreparedStatement stmt = null;
	
	try {
        conexao = OracleDBM.obterConexao();
        stmt = conexao.prepareStatement("INSERT INTO T_GASTO(CD_GASTO, DATA_GASTO, VALOR_GASTO, DS_GASTO, T_CLIENTE_CPF, T_TIPO_GASTO_CD_TIPO_GASTO) VALUES (SEQUENCE.NEXTVAL, ?, ?, ?, ?, ?)");
        stmt.setDate(1, (Date) gasto.getDataTransacao());
        stmt.setDouble(2, gasto.getValorTransacao());
        stmt.setString(3, gasto.getDescricaoGasto());
        stmt.setLong(4, gasto.getCpf());
        stmt.setInt(5, gasto.getCdCategoria());
        
  
        stmt.executeUpdate();
      } catch (SQLException e) {
        e.printStackTrace();
      } finally {
        try {
          stmt.close();
          conexao.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
	}
	
	public List<Gasto> listar() {
	    
	    List<Gasto> lista = new ArrayList<Gasto>();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = OracleDBM.obterConexao();
	    stmt = conexao.prepareStatement("SELECT * FROM T_GASTO");
	    rs = stmt.executeQuery();
	  
	    
	    while (rs.next()) {
	    		    	
	    int codigo = rs.getInt("CD_GASTO");
	    java.sql.Date dataTransacao = rs.getDate("DATA_GASTO");
	    double valorTransacao = rs.getDouble("VALOR_GASTO");
	    int cdCategoria= rs.getInt("T_TIPO_GASTO_CD_TIPO_GASTO");
	    long cpf = rs.getLong("T_CLIENTE_CPF");
	    String descricaoGasto = rs.getString("DS_GASTO");
	   
	        Gasto gastos = new Gasto(codigo, dataTransacao, valorTransacao, cdCategoria, cpf, descricaoGasto);
	      
	        lista.add(gastos);
	    }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        stmt.close();
	        rs.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	    return lista;
	  }
}
	
	
	
	