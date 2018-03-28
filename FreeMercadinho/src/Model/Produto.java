package Model;
public class Produto {
	int codigoProduto, qtdEstoque;
	String nomeProduto;
	double valorUnid;
	int qtdComprada;
	//construtor para produto cadastrado
	public Produto(int codigoProduto, String nomeProduto, int qtdEstoque, double valorUnid) {
		this.codigoProduto = codigoProduto;
		this.qtdEstoque=qtdEstoque;
		this.nomeProduto=nomeProduto;
		this.valorUnid = valorUnid;
	}
	public int getQtdComprada() {
		return qtdComprada;
	}
	public void setQtdComprada(int qtdComprada) {
		this.qtdComprada = qtdComprada;
	}
	//sobrecarga de construtor para produto comprado
	public Produto(int codigoProduto,int qtdComprada, String nomeProduto, double valorUnid) {
		this.codigoProduto = codigoProduto;
		this.nomeProduto=nomeProduto;
		this.valorUnid = valorUnid;
		this.qtdComprada=qtdComprada;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorUnid() {
		return valorUnid;
	}

	public void setValorUnid(double valorUnid) {
		this.valorUnid = valorUnid;
	}
	
	
	
}
