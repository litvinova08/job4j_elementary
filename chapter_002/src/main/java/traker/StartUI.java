package traker;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("first"));
        tracker.add(new Item("second"));
        tracker.add(new Item("third"));
        System.out.println(tracker.findById(1).getName());
        System.out.println(tracker.findById(2).getName());
        System.out.println(tracker.findById(3).getName());
        tracker.replace(1, new Item("replacement"));
        System.out.println(tracker.findById(1).getName());
    }
}
