package job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Rita";
        names[1] = "Sasha";
        names[2] = "Dima";
        names[3] = "Mama";

        for (int in = 0; in < names.length; in++) {
            System.out.println(names[in]);
        }
    }
}
