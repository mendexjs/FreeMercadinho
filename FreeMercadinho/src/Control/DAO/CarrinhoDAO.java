package Control.DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import Control.Factory.Conex�o;
import Model.Carrinho;
import Model.Produto;


public class CarrinhoDAO {
	
	public static String efetuarCompra(Carrinho compra){
		 Conex�o c = new Conex�o(); 
		 String sql="insert into compras values(null, ?, null, ?, ?)";
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
			return ("Problemas na conex�o do seu servidor.");
		} 	 
		return "Compra efetuada com Sucesso!";
	}

	public static void atualizarEstoque(int codigoProduto, int qtdComprada) {
		Conex�o c = new Conex�o();
		String sql="UPDATE produto SET qtdEstoque=qtdEstoque-? where codigoProduto=? ";
		PreparedStatement stmt;
		try {
			stmt = c.getCon().prepareStatement(sql);
			
			stmt.setInt(1, qtdComprada);
			stmt.setInt(2, codigoProduto);
	        stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao atualizar estoque");
		} 	 
		
		
		
	}
}
