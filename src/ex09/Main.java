package ex09;

import ex01.BubbleSort;
import ex01.InsertionSort;
import ex01.MergeSort;
import ex01.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 , 1, 0};

        long bubbleStart = System.nanoTime();
        BubbleSort.bubbleSort(array);
        long bubbleEnd = System.nanoTime() - bubbleStart;
        System.out.println("Swaps: " + BubbleSort.getCount());
        System.out.println((int) bubbleEnd);

        long insertionStart = System.nanoTime();
        InsertionSort.insertionSort(array);
        long insertionEnd = System.nanoTime() - insertionStart;
        System.out.println("Swaps: " + InsertionSort.getCount());
        System.out.println((int) insertionEnd);


        long selectionStart = System.nanoTime();
        SelectionSort.selectionSort(array);
        long selectionEnd = System.nanoTime() -selectionStart;
        System.out.println("Swaps: " + SelectionSort.getCount());
        System.out.println((int) selectionEnd);


        long mergeStart = System.nanoTime();
        MergeSort.mergeSort(array);
        long mergeEnd = System.nanoTime() - mergeStart;
        System.out.println("Swaps: " + MergeSort.getCount());
        System.out.println((int) mergeEnd);
    }
}