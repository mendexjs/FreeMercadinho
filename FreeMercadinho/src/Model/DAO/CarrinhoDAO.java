package Model.DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import Control.Factory.Conexão;
import Model.Carrinho;
import Model.Produto;


public class CarrinhoDAO {
	
	public static boolean efetuarCompra(Carrinho compra){
		 Conexão c = new Conexão(); 
		 String sql="insert into compras values(null, ?, now(), ?, ?)";
		 PreparedStatement stmt;
		try {
			stmt = c.getCon().prepareStatement(sql);
			
			stmt.setDouble(1, compra.getValorCompra());
			stmt.setString(2, compra.getFormaPagamento());
			stmt.setString(3, compra.getCaixaAtendente());
	        
	        stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		} 	 
		return true;
	}

	public static boolean atualizarEstoque(long codigoBarra, int qtdComprada) {
		Conexão c = new Conexão();
		String sql="UPDATE produto SET qtdEstoque=qtdEstoque-? where codigoProduto=? ";
		PreparedStatement stmt;
		try {
			stmt = c.getCon().prepareStatement(sql);
			
			stmt.setInt(1, qtdComprada);
			stmt.setLong(2, codigoBarra);
	        stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} 	 
		return true;	
	}
}
