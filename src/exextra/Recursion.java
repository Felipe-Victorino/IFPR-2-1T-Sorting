package exextra;

public class Recursion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(new Recursion().sumRecursive(array, array.length));
    }

    public int sumRecursive (int[] vetor, int tamanho){
        if (tamanho == 0) return 0;

        return vetor[tamanho - 1] + sumRecursive(vetor, tamanho -1);
    }
}