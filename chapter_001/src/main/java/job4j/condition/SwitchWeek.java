package job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                return name = "Monday";
            case 2:
                return name = "Tuesday";
            case 3:
                return name = "Wednesday";
            case 4:
                return name = "Thursday";
            case 5:
                return name = "Friday";
            case 6:
                return name = "Saturday";
            case 7:
                return name = "Sunday";
            default:
                return name = "Not found";
        }
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(4));
        System.out.println(nameOfDay(15));
    }
}
