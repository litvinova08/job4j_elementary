package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUIs {

    public static void main(String[] args) {
        Items item = new Items("test item");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTimeFormat = item.getCreated().format(formatter);
        System.out.println(dateTimeFormat);
    }
}
