package entidades;

public class ListaEncadeada {
	public No primeiro;
	public No ultimo;
	
	public ListaEncadeada() {
		this.primeiro = null;
		this.ultimo = null;
	}
	
	public boolean vazia() {
		return primeiro == null;
	}
	
	public void inserePrimeiro(int info) {
		No novoNo = new No(info);
		
		if (vazia()) {
			primeiro = novoNo;
			ultimo = novoNo;
		} else {
			novoNo.proximo = primeiro;
			primeiro = novoNo;
		}
	}
	
	public void insereDepois(No no, int info) {
		if (no == null) {
			System.out.println("O nó é nulo");
			return;
		}
		
		No novoNo = new No(info);
		novoNo.proximo = no.proximo;
		no.proximo = novoNo;
		
		if (no == ultimo) {
			ultimo = novoNo;
		}
	}
	
	public void insereUltimo(int info) {
		No novoNo = new No(info);
		
		if (vazia()) {
			primeiro = novoNo;
			ultimo = novoNo;
		} else {
			ultimo.proximo = novoNo;
			ultimo = novoNo;
		}
	}
	
	public No removePrimeiro() {
		if (vazia()) {
			System.out.println("Lista vazia");
			return null;
		}
		
		No temporario = primeiro;
		primeiro = primeiro.proximo;
		
		if (primeiro == null) {
			ultimo = null;
		}
		
		return temporario;
	}
	
	public No removeUltimo() {
		if (vazia()) {
			System.out.println("Lista vazia");
			return null;
		}
		
		No temporario = ultimo;
		
		if (primeiro == ultimo) {
			primeiro = null;
			ultimo = null;
		} else {
			No atual = primeiro;
			
			while(atual.proximo != ultimo) {
				atual = atual.proximo;
			}
			
			atual.proximo = null;
			ultimo = atual;
		}
		
		return temporario;
	}
	
	public No remove(No no) {
		if (vazia()) {
			System.out.println("Lista vazia");
			return null;
		}
		
		if (no == null) {
			System.out.println("Nó nulo");
			return null;
		}
		
		if (no == primeiro) {
			return removePrimeiro();
		}else if (no == ultimo) {
			return removeUltimo();		
		}else {
			No anterior = primeiro;
			No atual = primeiro.proximo;
			
			while (atual != null && atual != no) {
				anterior = atual;
				atual = atual.proximo;
			}
			
			if (atual != null) {
				anterior.proximo = atual.proximo;
				atual.proximo = null;
				return atual;
			} else {
				System.out.println("Nó não encontrado");
				return null;
			}
		}
	}
	
	public void mostrar() {
		if (vazia()) {
			System.out.println("Lista vazia");
		}else {
			No atual = primeiro;
			
			while (atual != null) {
				System.out.println(atual.info + " ");
				atual = atual.proximo;
			}
			
			System.out.println();
		}
	}
}
