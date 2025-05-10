package ex01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 4, 9, 2, 5, 8, 2, 1, 7};
        int [] arrayBubble = BubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(arrayBubble));

        int[] arraySelection = SelectionSort.selectionSort(array);
        System.out.println(Arrays.toString(arraySelection));

        int[] arrayInsertion = InsertionSort.insertionSort(array);
        System.out.println(Arrays.toString(arrayInsertion));

        MergeSort.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}