package ex10;

import ex09.Main09;

public class Main {
    public static void main(String[] args) {
        int[] arrayRandom = new VectorGen().generateArray(5);
        int[] inverArray = new VectorGen().invertArray(arrayRandom);

        System.out.println("BUBBLE SORT ===========");
        Main09.passToBubble(arrayRandom);
        Main09.passToBubble(inverArray);

        System.out.println("INSERTION SORT ===========");
        Main09.passToInsertion(arrayRandom);
        Main09.passToInsertion(inverArray);

        System.out.println("SELECTION SORT ===========");
        Main09.passToSelection(arrayRandom);
        Main09.passToSelection(inverArray);

        System.out.println("MERGE SORT ===========");
        Main09.passToMerge(arrayRandom);
        Main09.passToMerge(inverArray);

    }
}