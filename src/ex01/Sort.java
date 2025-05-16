package ex01;

abstract class Sort {
    private static int count;

    public static void incrementSwapCount(){
        count++;
    }

    public static int getCount() {
        return count;
    }
}