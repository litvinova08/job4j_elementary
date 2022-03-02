package ru.job4j.array;

public class ArrayChar {

    public static boolean startWith(char[] word, char[] pref) {
        boolean rsl = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
