package Control;

import Model.Avaliacao;
import Model.Carrinho;
import Model.DAO.AvaliacaoDAO;

public class AvaliacaoControl {

	public static boolean gerarAvaliacao(Avaliacao aval) {
		
		return AvaliacaoDAO.avaliar(aval);
	}


}
