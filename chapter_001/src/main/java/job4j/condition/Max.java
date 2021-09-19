package job4j.condition;

public class Max {
    public static int max(int one, int two) {
        int result = one > two ? one : two;
        return result;
    }

    public static int max(int one, int two, int three, int four) {
        int result = max(max(one, two), max(three, four));
        return result;
    }

    public static void main(String[] args) {
        int one = 4;
        int two = 55;
        int three = 33;
        int four = 15;
        System.out.println(Max.max(one, two));
        System.out.println(Max.max(one, two, three, four));
    }
}
