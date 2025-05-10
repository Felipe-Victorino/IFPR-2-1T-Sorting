package ex04;

import app.Global;

public class Main {
    public static void main(String[] args) {
        int[] array = {8, 4, 3, 7, 6, 5, 2};
        PartialSort.partialSort(array, 4);
        Global.printArray(array);
    }
}