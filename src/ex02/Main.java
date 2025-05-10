package ex02;
import app.Global;
public class Main {
    public static void main(String[] args) {
        int[] array = {3, 0, -2, 5, 8};
        Global.printArray(Bubble.bubbleSort(array));
    }
}