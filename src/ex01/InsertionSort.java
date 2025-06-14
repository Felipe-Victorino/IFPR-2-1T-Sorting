package ex01;

public class InsertionSort extends Sort{
    public static int[] insertionSort(int[] array){
        long startTime = System.nanoTime();
        for (int c = 1; c < array.length; c++) {
            int i = c;
            while (i > 0 && array[i - 1] > array[i]) {
                // enquanto indice for maior que zero e o array antecessor for maior que o array
                int aux = array[i];
                array[i] = array[i - 1];
                array[i - 1] = aux;
                Sort.incrementSwapCount();
                // troque
                i --;
            }
        }
        long endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / ((int) Math.pow(1, 9));
        return array;
    }
}