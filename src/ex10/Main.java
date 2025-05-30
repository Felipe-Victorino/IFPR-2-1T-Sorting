package ex10;

import ex09.Main09;

public class Main {
    public static void main(String[] args) {
        int[] arrayRandom = new VectorGen().generateArray(1000);
        int[] inverArray = new VectorGen().invertArray(arrayRandom);
        int[] sortedArray = {1, 2, 3, 4, 5};

        System.out.println("BUBBLE SORT ===========");
        System.out.println("Random Array: ");
        Main09.passToBubble(arrayRandom);
        System.out.println("Inverted Array: ");
        Main09.passToBubble(inverArray);
        System.out.println("Sorted Array: ");
        Main09.passToBubble(sortedArray);

        System.out.println("INSERTION SORT ===========");
        System.out.println("Random Array: ");
        Main09.passToInsertion(arrayRandom);
        System.out.println("Inverted Array: ");
        Main09.passToInsertion(inverArray);
        System.out.println("Sorted Array: ");
        Main09.passToInsertion(sortedArray);

        System.out.println("SELECTION SORT ===========");
        System.out.println("Random Array: ");
        Main09.passToSelection(arrayRandom);
        System.out.println("Inverted Array: ");
        Main09.passToSelection(inverArray);
        System.out.println("Sorted Array: ");
        Main09.passToSelection(sortedArray);

        System.out.println("MERGE SORT ===========");
        System.out.println("Random Array: ");
        Main09.passToMerge(arrayRandom);
        System.out.println("Inverted Array: ");
        Main09.passToMerge(inverArray);
        System.out.println("Sorted Array: ");
        Main09.passToMerge(sortedArray);

    }
}