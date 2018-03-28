package Control.DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Control.Factory.Conexão;
import Model.Carrinho;


public class CarrinhoDAO {
	
	public static String efetuarCompra(Carrinho compra){
		 Conexão c = new Conexão(); 
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
			return ("Problemas na conexão do seu servidor.");
		} 	 
		return "Compra efetuada com Sucesso!";
	}
}
