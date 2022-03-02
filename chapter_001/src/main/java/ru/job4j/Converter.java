package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 50;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 300;
        int exp = 6;
        double expDollar = 5;
        int out = Converter.rubleToEuro(in);
        boolean passed = exp == out;
        boolean passedDollar = expDollar == Converter.rubleToDollar(in);

        System.out.println("TEst " + passed);
        System.out.println(passedDollar);
    }
}