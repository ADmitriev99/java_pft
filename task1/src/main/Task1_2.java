package main;

public class Task1_2 {
    public static void main(String[] args) {
        System.out.println(sumDouble(2, 2));
    }

    public static int sumDouble(int a, int b) {
        if (a == b)
            return a * 4;
        else
            return a + b;
    }
}
