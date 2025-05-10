package ex03;

import app.Global;

public class Main {
    public static void main(String[] args) {
        String[] array = {"ccc", "bbb", "aaa"};
        Global.printArray(WordSorter.sort(array));
    }
}