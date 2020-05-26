package job4j.condition;

public class Max {
    public static int max(int one, int two) {
        int result = one > two ? one : two;
        return result;
    }

    public static void main(String[] args) {
        int one = 4;
        int two = 55;
        System.out.println(Max.max(one, two));
    }
}
