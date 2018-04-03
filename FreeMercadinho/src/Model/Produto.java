package Model;
public class Produto {
	long codigoProduto;
	int qtdEstoque;
	String nomeProduto;
	double valorUnid;
	int qtdComprada;
	//construtor para produto cadastrado
	public Produto(long codigoBarra, String nome, int qtdEst, double valorUnid) {
		this.codigoProduto = codigoBarra;
		this.qtdEstoque=qtdEst;
		this.nomeProduto=nome;
		this.valorUnid = valorUnid;
	}
	public int getQtdComprada() {
		return qtdComprada;
	}
	public void setQtdComprada(int qtdComprada) {
		this.qtdComprada = qtdComprada;
	}
	//sobrecarga de construtor para produto comprado
	public Produto(long codigoProduto,int qtdComprada, String nomeProduto, double valorUnid) {
		this.codigoProduto = codigoProduto;
		this.nomeProduto=nomeProduto;
		this.valorUnid = valorUnid;
		this.qtdComprada=qtdComprada;
	}

	public long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(long codigoProduto) {
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
