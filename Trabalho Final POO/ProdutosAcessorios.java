package entidades;

public class ProdutosAcessorios {
	
	private String nomeAcessorio;
	private Double precoAcessorio;

	public ProdutosAcessorios(String nomeAcessorio, Double precoAcessorio) {
		this.nomeAcessorio = nomeAcessorio;
		this.precoAcessorio = precoAcessorio;
	}
	
	public String getNomeAcessorio() {
		return nomeAcessorio;
	}

	public void setNomeAcessorio(String nomeAcessorio) {
		this.nomeAcessorio = nomeAcessorio;
	}

	public Double getPrecoAcessorio() {
		return precoAcessorio;
	}

	public void setPrecoAcessorio(Double precoAcessorio) {
		this.precoAcessorio = precoAcessorio;
	}

	public String etiqueta() {
		return getNomeAcessorio() + " R$" + String.format("%.2f", getPrecoAcessorio());
	
	}
}
