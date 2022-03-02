package ru.job4j.condition;

public class DivBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 2 == 0) {
            if (number % 3 == 0) {
                rsl = "Исходное число делится на 6.";
            } else {
                rsl = "Исходное число не делится на 3, но является четным.";
            }
        } else {
            if (number % 3 == 0) {
                rsl = "Исходное число делится на 3, но не является четным.";
            } else {
                rsl = "Исходное число не делится на 3 и не является четным.";
            }
        }
        return rsl;
    }

    public static void main(String[] agrs) {
        System.out.println(checkNumber(6));
        System.out.println(checkNumber(10));
        System.out.println(checkNumber(15));
        System.out.println(checkNumber(19));
    }
}
