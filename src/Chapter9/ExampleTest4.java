package Chapter9;

import java.util.function.Function;

public class ExampleTest4 {
    public static void main(String[] args) {
        double result = calc( (x, y) -> (x / y) );
        System.out.println("result: " + result);
    }
    public static double calc(FunctionEx fun) {
        double x = 10;
        double y = 4;
        return fun.apply(x, y);
    }
}

interface FunctionEx {
    double apply(double x, double y);
}