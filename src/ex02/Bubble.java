package ex02;

public class Bubble {
    public static int[] bubbleSort(int[] array) {
        for (int c = array.length; c > 0; c--) {
            boolean swapped = false;
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] > array[i - 1]) {
                    int aux = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = aux;
                    swapped = true;
                }
            }
            if(!swapped){ break;}
        }
        return array;
    }
}