package job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenMinOne() {
        int[] array = new int[] {4, 7, 6, 4, 22, 4, 3, 2, 14};
        int expected = 2;
        int out = Min.min(array);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirstMin() {
        int[] array = new int[] {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int result = Min.minInDiapasone(array, start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int result = Min.minInDiapasone(array, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int result = Min.minInDiapasone(array, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}