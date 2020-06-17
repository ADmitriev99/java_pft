package main;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.println(sleepIn(true, false));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation)
    {
        if ((weekday==true) && (vacation==false))
            return false;
        else
            return true;
    }
}
