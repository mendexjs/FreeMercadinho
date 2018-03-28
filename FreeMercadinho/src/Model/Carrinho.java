package Model;

public class Carrinho {
	double valorCompra;
	String data, caixaAtendente,formaPagamento;
	
	public Carrinho(double valorCompra, String data, String caixaAtendente, String formaPagamento) {
		this.valorCompra=valorCompra;
		this.data=data;
		this.caixaAtendente=caixaAtendente;
		this.formaPagamento=formaPagamento;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCaixaAtendente() {
		return caixaAtendente;
	}

	public void setCaixaAtendente(String caixaAtendente) {
		this.caixaAtendente = caixaAtendente;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
}
