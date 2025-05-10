package ex03;

import app.Global;

public class WordSorter {

    public static String[] sort(String[] array){
        char[][] wordMatrix = wordMatrixSplice(array);
        
        return array;
    }

    public static char[][] wordMatrixSplice(String[] array) {
        char[][] charArr = new char[array.length][array.length];
        for (int x = 0; x < array.length; x++) {
            char[] tempArray = array[x].toCharArray();

            for (int y = 0; y < charArr.length; y++) {
                charArr[x][y] = tempArray[y];
            }

        }
        return charArr;
    }
}