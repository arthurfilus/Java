package principal;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoPromocao;

public class CadastroProdutos {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Quantos produtos serão cadastrados? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Produto nº" + i + ":");
			System.out.print("O produto é novo, importado ou de promoção (n/i/p)? ");
			char type = sc.next().charAt(0);
			System.out.print("Qual é o nome? ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Qual é o preço? ");
			double preco = sc.nextDouble();
			if (type == 'n') {
				list.add(new Produto(nome, preco));
			}
			else if (type == 'i') {
				System.out.print("Qual é a taxa de Importação? ");
				double taxaImportacao = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxaImportacao));			
			}
			else {
				System.out.print("Qual é o desconto? ");
				double desconto = sc.nextDouble();
				list.add(new ProdutoPromocao(nome, preco, desconto));	
			}
		}
		
		System.out.println();
		System.out.println("Etiqueta de preço: ");
		for(Produto prod : list) {
			System.out.print(prod.etiquetaPreco());
		}
		sc.close();

	}

}
