package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery (int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(10);
        Battery two = new Battery(12);
        one.exchange(two);
        System.out.println(one.load);
        System.out.println(two.load);
    }
}
