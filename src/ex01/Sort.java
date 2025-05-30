package ex01;

abstract class Sort {
    private static int count;

    static long elapsedTime;

    public static void incrementSwapCount(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static long getElapsedTime() {
        return elapsedTime;
    }
}