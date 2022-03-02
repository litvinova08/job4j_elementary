package ru.job4j.calculator;
import ru.job4j.math.MathFunction;

public class Calculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second);
    }

    public static double sumMinusAndDivide(double first, double second) {
        return MathFunction.sum(MathFunction.minus(first, second), MathFunction.divide(first, second));
    }

    public static double sumAllFunctions(double first, double second) {
        double sumOfSumAndMultiply = MathFunction.sum(MathFunction.sum(first, second), MathFunction.multiply(first, second));
        double sumOfMinusAndDivide = MathFunction.sum(MathFunction.minus(first, second), MathFunction.divide(first, second));
        return MathFunction.sum(sumOfMinusAndDivide, sumOfSumAndMultiply);
    }

    public static void main(String[] args) {
        double fir = 5;
        double sec = 5;
        System.out.println(sumAndMultiply(fir, sec));
        System.out.println(sumAllFunctions(fir, sec));
    }
}
