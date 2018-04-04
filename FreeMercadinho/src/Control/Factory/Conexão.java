package Control.Factory;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
* Classe que cria nova conexão com servidor a partir das configurações do arquivo de Configs.
* 
* @author Mendex e Bigode
*/
public class Conexão {
	protected Connection con;
	public Conexão() {
		
		String host="";
		String user="";
		String senha="";
		try {
			Properties prop = ManipuladorConfig.getProp();
			host=prop.getProperty("prop.server.host");
			user=prop.getProperty("prop.server.user");
			senha=prop.getProperty("prop.server.senha");
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) java.sql.DriverManager
	                .getConnection(host, user, senha);
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
			System.out.println("Servidor em manutenção");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
}
