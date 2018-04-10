package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Control.Factory.Conexão;
import Model.Cliente;

public class ClienteDAO {
	public static boolean cadastroCliente(Cliente cli) {
		Conexão c = new Conexão(); 
		String sql="insert into cliente values( ?, ?)";
		PreparedStatement stmt;
		try {
			stmt = c.getCon().prepareStatement(sql);
			
			stmt.setString(1, cli.getCpf());
			stmt.setString(2, cli.getNome());
	        
	        stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		} 	 
		return true;
	}
}
