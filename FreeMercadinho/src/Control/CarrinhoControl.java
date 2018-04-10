package Control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import Model.DAO.*;
import Model.*;
public class CarrinhoControl {
	
	static ArrayList<Produto> carrinho= new ArrayList<>();
	static DecimalFormat df = new DecimalFormat("0.##");

	public static void esvaziarCarrinho() {
		carrinho.removeAll(carrinho);
	}
	public static String listarComprados(){
		String produtos="";
		for(int i=0; i<= carrinho.size()-1;i++) {
			Produto prod= carrinho.get(i);
			if(!prod.getNomeProduto().equals("")) {
				produtos+= " *"+prod.getNomeProduto()+" --- qtd:"+prod.getQtdComprada() + " unid: R$"+  df.format(prod.getValorUnid())+ " sub-total:R$"+df.format(prod.getQtdComprada()*prod.getValorUnid())+ " \r\n";
			}
		}
		return produtos;
	}
	public static int lerCodigoRepetido(long codigoBarra) {
		for(int i=0; i<= (carrinho.size()-1); i++) {
			Produto produto= carrinho.get(i);
			if(produto.getCodigoProduto() ==codigoBarra) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static Produto buscarProduto(long codigoBarra, int qtdProd) {
		double preco=0;
		String nome="";
		int repetido=lerCodigoRepetido(codigoBarra);
		if(repetido<0) {
			ResultSet rs = ProdutoDAO.importarProduto(codigoBarra);
			try {
				while(rs.next()) {
					preco= rs.getDouble("valorUnid");
					nome= rs.getString("nomeProduto");
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
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
	
	public static boolean cancelarItem(long codigoBarra, int quantidade) {
		for(int i=0; i<=(carrinho.size()-1);i++) {
			Produto prod= carrinho.get(i);
			if(prod.getCodigoProduto()==codigoBarra) {
				prod.setQtdComprada(prod.getQtdComprada() - quantidade);
				return true;
			}
		}
		return false;
		
	}
	
}
