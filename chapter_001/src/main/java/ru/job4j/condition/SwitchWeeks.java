package ru.job4j.condition;

public class SwitchWeeks {
    public static String nameOfDay(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not found";
        };
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(4));
        System.out.println(nameOfDay(15));
    }
}
