package ex01;

public class MergeSort extends Sort{

    public static void mergeSort(int[] array){
        long startTime = System.nanoTime();
        mergeSort(array, 0, array.length - 1);
        long endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / ((int) Math.pow(1, 9));
    }

    public static void mergeSort(int[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            Sort.incrementSwapCount();
            int meio = esquerda + (direita - esquerda) / 2;

            mergeSort(vetor, esquerda, meio);
            mergeSort(vetor, meio + 1, direita);

            merge(vetor, esquerda, meio, direita);

        }
    }

    public static void merge(int[] vetor, int esquerda, int meio, int direita) {

        int size1 = meio - esquerda + 1;
        int size2 = direita - meio;

        int[] E = new int[size1];
        int[] D = new int[size2];

        for (int i = 0; i < size1; ++i) {
            E[i] = vetor[esquerda + i];
        }

        for (int j = 0; j < size2; ++j) {
            D[j] = vetor[meio + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = esquerda;
        while (i< size1 && j < size2){
            if (E[i] <= D[j]){
                vetor[k] = E[i];
                i++;
            } else {
                vetor[k] = D[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            vetor[k] = E[i];
            i++;
            k++;
        }
        while (j < size2) {
            vetor[k] = D[j];
            j++;
            k++;
        }
    }
}