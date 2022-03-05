package ru.job4j.poly;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Buses use highways & bus lines");
    }

    @Override
    public void fillUpWithFuel() {
        System.out.println("modern buses need electricity");
    }
}
