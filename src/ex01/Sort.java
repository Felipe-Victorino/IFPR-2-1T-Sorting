package ex01;

abstract class Sort {
    private static int count;

    public static void incrementCount(){
        count++;
    }

    public static int getCount() {
        return count;
    }
}