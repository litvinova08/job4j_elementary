package ru.job4j.tracker;

public class UserStore {
    public static void main(String[] args) {
        User user = new User(1, "first User", "first user password");
        System.out.println(user.getId()  + " " + user.getUsername() + " " + user.getPassword());
        System.out.println(user.toString());
        String greeting = "Hello" + user;
        System.out.println(greeting);
    }
}
