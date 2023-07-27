package app;

public class selectionSort 
{
	public static void main(String[] args)
	{
	int[] vetor = {3,6,8,1,4,9,0};	
	
	System.out.println("Vetor original: ");
	for(int num : vetor)
	{
		System.out.println(num + " ");
	}
	
	int posicao, vetaux;  // inicio do selection sort, com "posicao" sendo a menor posição e "vetaux" o auxiliar que grava o menor número
	for(int i=0; i < vetor.length; i++) 
	{
		posicao = i;
		for(int j = i+1; j < vetor.length; j++)
			
			
		{
			if (vetor[j] < vetor[posicao]) 
			{
				posicao = j;
			}
		}
		vetaux = vetor[posicao];
		vetor[posicao] = vetor[i];
		vetor[i] = vetaux;
	}
	
	System.out.println("Vetor ordenado/refeito: ");
	for(int num : vetor)
	{
		System.out.println(num + " ");
	}
	
}
}

