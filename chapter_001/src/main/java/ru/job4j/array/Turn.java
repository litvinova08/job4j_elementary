package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int end = 1;
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - end];
            array[array.length - end] = temp;
            end++;
        }
        return array;
    }
}
