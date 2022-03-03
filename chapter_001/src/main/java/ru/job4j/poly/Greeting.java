package ru.job4j.poly;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome. What's your name?");
        String name = input.nextLine();
        System.out.println(name + ", Glad to see you!");
    }
}
