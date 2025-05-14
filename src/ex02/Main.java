package ex02;
import app.Global;
import ex01.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 0, -2, 5, 8};
        Global.printArray(BubbleSort.descBubble(array));
    }
}