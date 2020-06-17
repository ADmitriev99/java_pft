package main;

public class Task1_3 {
    public static void main(String[] args) {
        System.out.println(altPairs("abrakadabra"));
    }

    public static String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 4 < 2) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
