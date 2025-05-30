package ex01;

public class SelectionSort extends Sort{
    public static int[] selectionSort(int[] array){
        long startTime = System.nanoTime();
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
            Sort.incrementSwapCount();
        }
        long endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / ((int) Math.pow(1, 9));
        return array;
    }
}