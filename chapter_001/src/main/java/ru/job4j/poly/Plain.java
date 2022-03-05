package ru.job4j.poly;

public class Plain implements Vehicle {

    @Override
    public void move() {
        System.out.println("Plains fly");
    }

    @Override
    public void fillUpWithFuel() {
        System.out.println("Plains need aviation kerosene");
    }
}
