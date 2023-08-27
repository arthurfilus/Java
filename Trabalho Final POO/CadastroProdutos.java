package principal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoPromocao;
import entidades.ProdutosAcessorios;

public class CadastroProdutos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		List<ProdutosAcessorios> aces = new ArrayList<>();
		
		try {
		int n = 0;
		while (n < 1) {
			System.out.print("Quantos produtos serão cadastrados? ");
			n = sc.nextInt();
			if (n < 1) {
				System.out.println("Número inválido de produtos.");
			}
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println("Produto nº" + i + ":");
			System.out.print("O produto é novo, importado ou de promoção (n/i/p)? ");
			char type = sc.next().charAt(0);
			System.out.print("Qual é o nome? ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Qual é o preço? ");
			double preco = sc.nextDouble();
			switch (type) {
			case 'n':
				list.add(new Produto(nome, preco));
				break;
			case 'i':
				System.out.print("Qual é a taxa de Importação? ");
				double taxaImportacao = sc.nextDouble();
				break;
			case 'p':
				System.out.print("Qual é o desconto? ");
				double desconto = sc.nextDouble();
				list.add(new ProdutoPromocao(nome, preco, desconto));
				break;
			default:
				System.out.println("Tipo de produto inválido!");
				break;
			}
			
			System.out.print("Deseja comprar acessórios (s/n)? ");
			char envio = sc.next().charAt(0);
			if (envio == 's') {
				System.out.print("Qual é o nome do acessório? ");
				sc.nextLine();
				String nomeAcessorio = sc.nextLine();
				
				System.out.print("Qual é o preço do acessório? ");
				double precoAcessorio = sc.nextDouble();
				aces.add(new ProdutosAcessorios(nomeAcessorio, precoAcessorio));
			} else {
				list.add(new Produto(nome, preco));
			}
		}
		
		System.out.println();
		System.out.println("Etiqueta de preço: ");
		for(Produto prod : list) {
			System.out.print(prod.etiquetaPreco() + " - ");
		}
		System.out.println();
		for(ProdutosAcessorios acessorio : aces) {
			if (aces.isEmpty()){
				System.out.println("Não há acessórios.");
			} else {
				System.out.println("Etiqueta de acessórios: ");
				System.out.print(acessorio.etiqueta() + " - ");
			}
		}
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido! Por favor, insira um valor numérico.");
		} catch (Exception e) {
			System.out.println("Erro inesperado: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
	
}

