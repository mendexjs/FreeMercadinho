package Control.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Control.Factory.Conex�o;
import Model.Produto;


public class ProdutoDAO {
	public static ResultSet importarProduto(int codigoProd) {
		ResultSet rs;
		Conex�o c = new Conex�o();
		String sql = "select * from produto where codigoProduto=?";
		PreparedStatement stmt;
		try {
			stmt = c.getCon().prepareStatement(sql);
			stmt.setInt(1, codigoProd);
			rs = stmt.executeQuery();
		}catch (SQLException e) {
			System.out.println("Falha na conex�o ao seu servidor!");
			
			rs= null;
		}
		return rs;
	    }

	public static String cadastrarProduto(Produto produtoCadastro) {
		
		Conex�o c = new Conex�o(); 
		String sql="insert into produto values(?, ?, ?, ?)";
		PreparedStatement stmt;
		try {
			stmt = c.getCon().prepareStatement(sql);
			stmt.setInt(1, produtoCadastro.getCodigoProduto());	
			stmt.setString(2, produtoCadastro.getNomeProduto());
			stmt.setInt(3, produtoCadastro.getQtdEstoque());
			stmt.setDouble(4, produtoCadastro.getValorUnid());
			        
			stmt.execute();
		} catch (SQLException e) {
			return ("Problemas na conex�o do seu servidor.");
		} 	 
		return "Produto cadastrado com Sucesso!\n\n";	
		    
	}
}
