package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "==Replace item==";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id: "));
        String name = input.askStr("Enter id name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Replacement completed successfully");
        } else {
            System.out.println("Replacement cannot be completed. Id does not exist");
        }
        return true;
    }
}
