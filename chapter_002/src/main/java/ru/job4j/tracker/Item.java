package ru.job4j.tracker;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Item {

    private final LocalDateTime created = LocalDateTime.now();
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
    private int id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public Item() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Item{"
                + "created="
                + created.format(FORMATTER)
                + ", id="
                + id
                + ", name='"
                + name
                + '\''
                + '}';
    }
}
