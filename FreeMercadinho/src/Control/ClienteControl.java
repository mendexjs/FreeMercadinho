package Control;

import Model.Cliente;
import Model.DAO.ClienteDAO;

public class ClienteControl {

	public static boolean cadastroCliente(Cliente cli) {
		return ClienteDAO.cadastroCliente(cli);
	}

}
