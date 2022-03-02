package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
<<<<<<< HEAD
        Tracker tracker = new Tracker();
        tracker.add(new Item("first"));
        tracker.add(new Item("second"));
        tracker.add(new Item("third"));
        System.out.println(tracker.findById(1).getName());
        System.out.println(tracker.findById(2).getName());
        System.out.println(tracker.findById(3).getName());
        tracker.replace(1, new Item("replacement"));
        System.out.println(tracker.findById(1).getName());
        tracker.add(new Item("forth"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = tracker.findById(4).getCreated().format(formatter);
        System.out.println(currentDateTimeFormat);

        System.out.println("9. toString [#310018]");
        Item item = new Item("Task #310018");
        System.out.println(item);
=======
        Item item = new Item("test item");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTimeFormat = item.getCreated().format(formatter);
        System.out.println(dateTimeFormat);
>>>>>>> origin/master
    }
}
