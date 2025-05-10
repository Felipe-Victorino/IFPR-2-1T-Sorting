package ex03;

import java.util.Arrays;
import ex01.MergeSort;

public class WordSorter {

    public static String[] sort(String[] array){
        for (int c = 0; c < array.length-1; c++) {
            boolean swapped = false;
            for (int i = 0; i < array.length-1; i++) {

                if(array[i].compareTo(array[i + 1]) > 0){
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){break;}
        }
        return array;
    }

}