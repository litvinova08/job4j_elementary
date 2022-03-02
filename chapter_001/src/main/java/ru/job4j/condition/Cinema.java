package ru.job4j.condition;

public class Cinema {
    public static void main(String[] args) {
        access(15);
        access(45);
    }

    public static void access(int age) {
        System.out.println("the age is " + age);
        if (age >= 18) {
            System.out.println("welcome");
        } else {
            System.out.println("no entry");
        }
    }

}
