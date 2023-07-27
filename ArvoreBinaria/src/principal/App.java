package principal;
import entidades.Arvore;
import entidades.No;

public class App {

	public static void main(String[] args) {
		Arvore a = new Arvore();
		
		a.insere(10);
		a.insere(20);
		a.insere(30);
		a.insere(5);
		a.insere(4);
		a.insere(6);
		a.insere(19);
		
		a.preOrdem();
		System.out.println();
		a.emOrdem();
		System.out.println();
		a.posOrdem();

	}

}
