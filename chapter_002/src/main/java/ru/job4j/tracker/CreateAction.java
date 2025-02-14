package ru.job4j.tracker;

public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "==Add new item==";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter item name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
        return true;
    }
}
