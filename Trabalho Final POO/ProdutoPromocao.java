package entidades;

public class ProdutoPromocao extends Produto {
	
	private Double desconto;

	public ProdutoPromocao(String nome, Double preco, Double desconto) {
		super(nome, preco);
		this.desconto = desconto;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public Double precoDesconto() {
		return getPreco() - desconto;
	}
	
	@Override
	public String etiquetaPreco() {
		return getNome() + " R$" + String.format("%.2f", precoDesconto());
	}
}
