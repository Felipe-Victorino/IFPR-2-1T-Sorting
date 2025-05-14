package ex06;

import app.Global;
import ex01.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {85, 70, 95, 60, 75, 80};
        Global.printArray(array);
        MergeSort.mergeSort(array);
        Global.printArray(array);
        System.out.printf("Mediana: %.1f %n", median(array));
    }

    public static double median(int[] array) {
        int meio = (array.length -1 )/ 2;
        if (array.length % 2 == 0) {
            int meio2 = (array.length-1) / 2 + 1 ;
            return (double) (array[meio] + array[meio2]) /2;
        } else {
            return array[meio];
        }
    }


}