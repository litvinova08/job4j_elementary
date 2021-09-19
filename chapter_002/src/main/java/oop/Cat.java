package oop;

public class Cat {

    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        peppy.giveNick("Peppy");
        peppy.show();
    }
}
