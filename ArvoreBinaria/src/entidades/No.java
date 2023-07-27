package entidades;

public class No {
	public int info;
	private No dir;
	private No esq;
	
	public No(int info) {  // construtor do nó passando a informação como parametro
		this.info = info;
	}
	
	public No esq() {
		return esq;
	}
	
	public No dir() {
		return dir;
	}
	
	public int info() {
		return info;
	}

	public void setDir(No dir) {  // colocar nó à esquerda
		this.dir = dir;
	}

	public void setEsq(No esq) {  // colocar nó à esquerda
		this.esq = esq;
	}

	public void setInfo(int info) {   // colocar informação no nó
		this.info = info;
	}
	
	
	
	
	
}


