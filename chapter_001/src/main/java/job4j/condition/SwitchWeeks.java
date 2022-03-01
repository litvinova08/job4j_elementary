package job4j.condition;

public class SwitchWeeks {
    public static String nameOfDay(int day) {
        String name;
        return switch (day) {
            case 1 -> name = "Monday";
            case 2 -> name = "Tuesday";
            case 3 -> name = "Wednesday";
            case 4 -> name = "Thursday";
            case 5 -> name = "Friday";
            case 6 -> name = "Saturday";
            case 7 -> name = "Sunday";
            default -> name = "Not found";
        };
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(4));
        System.out.println(nameOfDay(15));
    }
}
