package ex01;

public class SelectionSort {
    public static int[] selectionSort(int[] array){
        for (int c = 0; c < array.length; c++) {
            int small = c;
            for (int i = c + 1; i < array.length; i++) {
                if (array[i] < array[small]) {
                    small = i;
                }
            }
            int aux = array[small];
            array[small] = array[c];
            array[c] = aux;
        }
        return array;
    }
}