public class BubbleSortRec {
    public static void bubbleSortRec(int[] vetor, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                int temp = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = temp;
            }
        }
        bubbleSortRec(vetor, n - 1);
    }

    public static void main(String[] args) {
        int[] vetor = {3, 6, 8, 1, 4, 9, 0};
        int n = vetor.length;

        System.out.println("Conjunto de numeros:");
        imprimirVetor(vetor);

        bubbleSortRec(vetor, n);

        System.out.println("\nConjunto de numeros ordenado:");
        imprimirVetor(vetor);
    }

    public static void imprimirVetor(int[] vetor) {
        for (int j : vetor) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
