interface Function {
    double call(double x);
}

public class Nask {
    public static void main(String[] args) {
        System.out.println(integrate(x -> x*x, 0, 1));
    }

    public static double integrate(Function Function, double start, double end) {
        double result = 0;

        for(double i = start; i < end-0.05; i+=0.1)
        {
            System.out.println(i + " "+ Function.call(i));
            result += Function.call(i) * 0.1;
        }
        return result;
    }
}