package ex10;

import ex01.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] arrayRandom = new VectorGen().generateArray(5);
        int[] inverArray = new VectorGen().invertArray(arrayRandom);

        long bubbleStart = System.nanoTime();
        BubbleSort.bubbleSort(arrayRandom);
        long bubbleEnd = System.nanoTime() - bubbleStart;
        System.out.println("Swaps: " + BubbleSort.getCount());
        System.out.println((int) bubbleEnd);

        long bubbleStartI = System.nanoTime();
        BubbleSort.bubbleSort(inverArray);
        long bubbleEndI = System.nanoTime() - bubbleStartI;
        System.out.println("Swaps: " + BubbleSort.getCount());
        System.out.println((int) bubbleEndI);
    }
}