package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Control.AvaliacaoControl;
import Control.Factory.Conexão;
import Model.Avaliacao;

public class AvaliacaoDAO {

	public static boolean avaliar(Avaliacao aval) {
		Conexão c = new Conexão(); 
		String sql="insert into avaliacoes values(null, ?, ?, ?, now())";
		PreparedStatement stmt;
		try {
			stmt = c.getCon().prepareStatement(sql);
			
			stmt.setInt(1, aval.getNota());
			stmt.setString(2, aval.getNomeCaixa());
			stmt.setString(3, aval.getCpf());
	        
	        stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		} 	 
		return true;
	}
}
