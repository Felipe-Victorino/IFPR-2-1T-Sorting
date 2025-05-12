package ex05;

public class MatrixSort {

    public static int[][] bubbleMatrix (int[][] matrix){
        // [1, 2, 3] [4, 5, 6] [7, 8, 9]
        // 1.1 1.2 1.3 2.1 2.2 2.3 3.1 3.2 3.3
        int n = matrix.length * matrix.length;
        for (int c = 0; c < n - 1; c++) {
            for (int i = 0; i < n - 1; i++) {
                if (matrix[i / matrix.length][i % matrix.length] > matrix[(i+1) / matrix.length ][(i+ 1) % matrix.length]) {
                    int aux = matrix[i / matrix.length][i % matrix.length];
                    matrix[i / matrix.length][i % matrix.length] = matrix[(i+1) / matrix.length ][(i+ 1) % matrix.length];
                    matrix[(i+1) / matrix.length ][(i+ 1) % matrix.length] = aux;
                }
            }
        }
        return matrix;
    }
}