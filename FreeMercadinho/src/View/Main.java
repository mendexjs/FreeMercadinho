/*package View;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Control.DAO.CarrinhoDAO;
import Control.DAO.ProdutoDAO;
import Model.Carrinho;
import Model.Produto;

public class Main{	
	static Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
	
	
	
	public static void compra() {
		String fim="";
		int codigoAtual=0;
		ArrayList<Produto> carrinho= new ArrayList<>();
		double preco=0;
		String nome="";
		do {
				System.out.println("Leia o c�digo");
				codigoAtual = leitor.nextInt();
				int repetido=lerCodigoRepetido(codigoAtual, carrinho);
				if(repetido<0) {
					System.out.println("Quantidade: ");
					int qtdProduto=leitor.nextInt();
					ResultSet rs = ProdutoDAO.importarProduto(codigoAtual);
					try {
						while(rs.next()) {
							preco= rs.getDouble("valorUnid");
							nome= rs.getString("nomeProduto");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					Produto produto= new Produto(codigoAtual, qtdProduto, nome, preco);
					carrinho.add(produto);
				}else {
					System.out.println("Quantidade: ");
					int qtdProduto=leitor.nextInt();
					Produto mesmoProduto= carrinho.get(repetido);
					mesmoProduto.setQtdComprada(mesmoProduto.getQtdComprada() +qtdProduto);
				}
				System.out.println("Para concluir a compra digite 1.");
				fim=leitor.next();
		}while(!fim.equals("1"));
		
		double totalCompra=0;
		for(int i=0; i<=(carrinho.size()-1);i++) {
			Produto prod= carrinho.get(i);
			totalCompra += (prod.getQtdComprada() * prod.getValorUnid());
		}
		System.out.println("Nome Caixa Atendente: ");
		leitor=new Scanner(System.in);
		String nomeCaixa=leitor.next();
		leitor=new Scanner(System.in);
		System.out.println("Pagamento: ");
		String pagamento= leitor.next();
		leitor=new Scanner(System.in);
		Carrinho carrinhoFinal = new Carrinho(totalCompra, "", nomeCaixa, pagamento);
		System.out.println(CarrinhoDAO.efetuarCompra(carrinhoFinal));
		atualizarEstoque(carrinho);
	}
	
	
	public static void main(String[] args) {
		System.out.println("IFShop");
		int opc=0;
		do {
			leitor= new Scanner(System.in);
			System.out.println("1- compra");
			System.out.println("2- cadastroProdutos");
			System.out.println("3- Finalizar\n");
			opc=leitor.nextInt();
			if(opc==1) {
				compra();
			}else if(opc==2) {
				cadastroProdutos();
			}
		}while(opc!=3);
		System.out.println("FreeMercadinho ENCERRADO.");
		
	}
}
*/