package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        for (int index = 0; index < data.length; index++) {
            if (data[index] != data[0]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
