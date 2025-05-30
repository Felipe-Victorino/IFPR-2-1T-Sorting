package ex09;

import ex01.BubbleSort;
import ex01.InsertionSort;
import ex01.MergeSort;
import ex01.SelectionSort;

public class Main09 {
    public static void main(String[] args) {
        int[] array = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 , 1, 0};

        //TODO: Considerando as limitações do método nanoTime, seria bom encontrar uma maneira melhor de classificar esses algorítimos. Mas por enquanto, funciona.
        
        passToBubble(array);
        passToInsertion(array);
        passToSelection(array);
        passToMerge(array);
    }

    public static void passToBubble(int[] array) {
        BubbleSort.bubbleSort(array);
        System.out.println("Swaps: " + BubbleSort.getCount());
        System.out.println((int) BubbleSort.getElapsedTime());
    }

    public static void passToInsertion(int[] array){
        InsertionSort.insertionSort(array);
        System.out.println("Swaps: " + InsertionSort.getCount());
        System.out.println(InsertionSort.getElapsedTime());
    }

    public static void passToSelection(int[] array) {
        SelectionSort.selectionSort(array);
        System.out.println("Swaps: " + SelectionSort.getCount());
        System.out.println(SelectionSort.getElapsedTime());
    }

    public static void passToMerge(int[] array) {
        MergeSort.mergeSort(array);
        System.out.println("Swaps: " + MergeSort.getCount());
        System.out.println(MergeSort.getElapsedTime());
    }
}