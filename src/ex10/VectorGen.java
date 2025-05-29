package ex10;
import java.util.Random;
import ex01.MergeSort;

public class VectorGen {

    Random rand = new Random();

    public int[] generateArray(int size){

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(size);
        }

        return array;
    }

    public void sortArray(int[] array){
        MergeSort.mergeSort(array);
    }

    public int[] invertArray(int[] array){
        int[] invertedArray = new int[array.length];
        int len = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            invertedArray[i] = array[len];
            len--;
        }

        return invertedArray;
    }
}