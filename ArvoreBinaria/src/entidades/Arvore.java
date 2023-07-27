package entidades;

public class Arvore {
	private No raiz;
	
	public void insere(int valor) {
		insere(raiz, valor);
	}
	
	public void insere(No no, int valor) {
		if(no == null) {
			raiz = new No(valor);
		}
		else if(valor >= no.info) {
			
			if(no.dir() == null) {
				no.setDir(new No(valor));
			}
			else {
				insere(no.dir(), valor);
			}
		}
		else if(no.esq() == null) {
			no.setEsq(new No(valor));
		}
		else {
			insere(no.esq(), valor);
		}
	}
	
	public void preOrdem() {
		preOrdem(raiz);
	}
	
	public void preOrdem(No no) {
		if(no != null) {
			System.out.print(no.info() + " ");
			preOrdem(no.esq());
			preOrdem(no.dir());
		}
	}
	
	public void posOrdem() {
		posOrdem(raiz);
	}
	
	public void posOrdem(No no) {
		if(no != null) {
			posOrdem(no.esq());
			posOrdem(no.dir());
			System.out.print(no.info() + " ");
		}
	}
	
	public void emOrdem() {
		emOrdem(raiz);
	}
	
	public void emOrdem(No no) {
		if(no != null) {
			emOrdem(no.esq());
			System.out.print(no.info() + " ");
			emOrdem(no.dir());
		}
	}
}
