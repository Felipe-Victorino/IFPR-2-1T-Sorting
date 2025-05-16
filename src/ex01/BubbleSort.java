package ex01;

public class BubbleSort extends Sort{

    public static int[] bubbleSort(int[] array) {
        for (int c = 0; c < array.length - 1; c++) {
            boolean swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    Sort.incrementSwapCount();
                    swapped = true;
                }
            }
            if(!swapped){ break;}
        }
        return array;
    }

    public static int[] descBubble(int[] array){
        for (int c = 0; c < array.length - 1; c++) {
            boolean swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    swapped = true;
                }
            }
            if(!swapped){ break;}
        }
        return array;
    }
}