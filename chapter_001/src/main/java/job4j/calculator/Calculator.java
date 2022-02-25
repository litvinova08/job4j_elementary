package job4j.calculator;
import static job4j.math.MathFunction.*;

public class Calculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }
    public static double sumMinusAndDivide(double first, double second) {
        return sum(minus(first, second), divide(first, second));
    }
    public static double sumAllFunctions(double first, double second) {
        double sumOfSumAndMultiply = sum(sum(first, second), multiply(first, second));
        double sumOfMinusAndDivide = sum(minus(first, second), divide(first, second));
        return sum(sumOfMinusAndDivide, sumOfSumAndMultiply);
    }

    public static void main(String[] args) {
        double fir = 5;
        double sec = 5;
        System.out.println(sumAndMultiply(fir, sec));
        System.out.println(sumAllFunctions(fir, sec));
    }
}
