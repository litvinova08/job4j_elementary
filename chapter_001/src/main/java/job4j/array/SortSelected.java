package job4j.array;

public class SortSelected {
    public static int[] sort(int[] array) {
        int temp = -1;
        for (int index = 0; index < array.length; index++) {
            int min = Min.minInDiapasone(array, index, array.length - 1);
            int indexToSwap = FindLoop.indexOf(array, min);
            temp = array[index];
            array[index] = array[indexToSwap];
            array[indexToSwap] = temp;
        }
        return array;
    }
}
