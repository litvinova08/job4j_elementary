package ru.job4j.poly;

public class Train implements Vehicle{

    @Override
    public void move() {
        System.out.println("Train needs railway");
    }

    @Override
    public void fillUpWithFuel() {
        System.out.println("Train needs coal");
    }
}
