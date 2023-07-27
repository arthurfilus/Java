package principal;

import entidades.ListaEncadeada;
import entidades.No;

public class Teste {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.inserePrimeiro(300);
        lista.inserePrimeiro(200);
        lista.inserePrimeiro(100);
        
        lista.mostrar();
        
        lista.insereUltimo(1000);
        lista.insereUltimo(100000);
        
        lista.mostrar();
        
        No no = lista.removePrimeiro();
        System.out.println("Remoção de nó: " + no.info);
        System.out.println("Nova lista: ");
        
        lista.mostrar();
        
        no = lista.removeUltimo();
        System.out.println("Remoção de nó: " + no.info);
        System.out.println("Nova lista: ");
        
        lista.mostrar();
        
        No noParaRemover = lista.primeiro.proximo;
        no = lista.remove(noParaRemover);
        System.out.println("Remoção de nó: " + no.info);
        System.out.println("Nova lista: ");
        
        lista.mostrar();

	}

}
