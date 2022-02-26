package job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] doubleArray = {{1},{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int[] array : doubleArray) {
            System.out.println("Размер вложенного массива: " + array.length);
        }
    }
}
