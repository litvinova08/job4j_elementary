package ru.job4j.first;

/**
 *
 */

public class Calculator {

    public static void plus(int one, int two) {
        System.out.println(one + two);
    }

    public static int fun1(int x) {
        return x * x + 1;
    }

    public static int fun2(int x) {
        return x * 10;
    }

    public static void main(String[] args) {
        int x = 100;
        System.out.println(Calculator.fun1(x) + Calculator.fun1(x));
            }
}
