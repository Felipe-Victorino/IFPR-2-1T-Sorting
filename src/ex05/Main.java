package ex05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 1},{6, 5, 4},{9, 8, 7}};
        System.out.println(Arrays.deepToString(MatrixSort.bubbleMatrix(matrix)));
    }
}