package ex01;

public class InsertionSort {
    public static int[] insertionSort(int[] array){
        for (int c = 1; c < array.length; c++) {
            int i = c;
            while (i > 0 && array[i - 1] > array[i]) {
                // enquanto indice for maior que zero e o array antecessor fro maior que o array
                int aux = array[i];
                array[i] = array[i - 1];
                array[i - 1] = aux;
                // troque
                i --;
            }
        }
        return array;
    }
}