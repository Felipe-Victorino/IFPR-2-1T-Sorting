package ex06;

import app.Global;
import ex01.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {85, 70, 95, 60, 75, 80};
        Global.printArray(array);
        MergeSort.mergeSort(array);
        Global.printArray(array);
    }

}