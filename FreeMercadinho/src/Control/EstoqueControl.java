package Control;
import java.util.ArrayList;
import Model.DAO.*;
import Model.*;
public class EstoqueControl {
	
	public static void atualizarEstoque(ArrayList<Produto> carrinho) {
		for(int i=0;i <=(carrinho.size()-1); i++){
			Produto atual= carrinho.get(i);
			CarrinhoDAO.atualizarEstoque(atual.getCodigoProduto(), atual.getQtdComprada());
		}
	}

	
	public static boolean cadastroProdutos(long codigoProd, int qtdProd,String nomeProd, double precoProd) {
		Produto produtoCadastro=new Produto(codigoProd, nomeProd,qtdProd, precoProd);
		if(ProdutoDAO.cadastrarProduto(produtoCadastro)) {
			return true;
		}else {
			return false;
		}
	}

}