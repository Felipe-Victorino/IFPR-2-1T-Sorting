package ex04;

public class PartialSort {

    public static int[] partialSort(int[] array, int n) {
        for (int c = 0; c < n - 1; c++) {
            boolean swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    swapped = true;
                }
            }
            if(!swapped){ break;}
        }
        return array;
    }
}