package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int reply = new Random().nextInt(3);
        if (reply == 0) {
            System.out.println("Yes");
        } else if (reply == 1) {
            System.out.println("No");
            } else if (reply == 2) {
            System.out.println("Maybe");
        }
    }
}
