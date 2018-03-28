package Control.Factory;


import java.sql.Connection;
import java.sql.SQLException;

/**
* Classe que cria nova conexão com servidor.
* 
* @author Mendex e Bigode
*/
public class Conexão {
	protected Connection con;
	public Conexão() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) java.sql.DriverManager
	                .getConnection("jdbc:mysql://localhost:3306/mercado"
	                , "root"
	                , ""  );
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
			System.out.println("Servidor em manutenção");
		}
		
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
}
