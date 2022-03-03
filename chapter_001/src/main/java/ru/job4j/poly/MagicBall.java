package ru.job4j.poly;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 1 -> System.out.println("YES");
            case 2 -> System.out.println("NO");
            default -> System.out.println("MAYBE");
        }
    }
}
