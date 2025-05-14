package ex07;

import app.Global;
import ex01.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] score = {250, 300, 150, 400, 350};
        int[] descArray = BubbleSort.descBubble(score);
        Global.printArray(descArray);
        System.out.println("Maior pontuação: " + descArray[0]);
    }
}