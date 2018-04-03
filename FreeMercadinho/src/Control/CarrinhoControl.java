package Control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.DAO.*;
import Model.*;
public class CarrinhoControl {
	
	static ArrayList<Produto> carrinho= new ArrayList<>();
	
	public static int lerCodigoRepetido(long codigoBarra, ArrayList<Produto> carrinho) {	
		for(int i=0; i<= (carrinho.size()-1);i++) {
			Produto produto= carrinho.get(i);
			return produto.getCodigoProduto() ==codigoBarra?i:-1;
		}
		return -1;
	}
	
	
	public static Produto buscarProduto(long codigoBarra, int qtdProd) {
		double preco=0;
		String nome="";
		int repetido=lerCodigoRepetido(codigoBarra, carrinho);
		if(repetido<0) {
			ResultSet rs = ProdutoDAO.importarProduto(codigoBarra);
			try {
				while(rs.next()) {
					preco= rs.getDouble("valorUnid");
					nome= rs.getString("nomeProduto");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			Produto produto= new Produto(codigoBarra, qtdProd, nome, preco);
			carrinho.add(produto);
			return produto;
		}else {
			Produto mesmoProduto= carrinho.get(repetido);
			mesmoProduto.setQtdComprada(mesmoProduto.getQtdComprada() +qtdProd);
			return mesmoProduto;
		}
	}
	
	
	
	public static boolean concluirCompra(String nomeAtendende, String formaPagamento) {	
		double totalCompra=0;
		totalCompra= calcularTotal();
		Carrinho carrinhoFinal = new Carrinho(totalCompra, "", nomeAtendende, formaPagamento);
		if(CarrinhoDAO.efetuarCompra(carrinhoFinal)) {
			EstoqueControl.atualizarEstoque(carrinho);
			return true;
		}
		return false;
	}
	
	public static double calcularTotal() {
		double totalCompra=0;
		for(int i=0; i<=(carrinho.size()-1);i++) {
			Produto prod= carrinho.get(i);
			totalCompra += (prod.getQtdComprada() * prod.getValorUnid());
		}
		
		return totalCompra;
	}
	
}
