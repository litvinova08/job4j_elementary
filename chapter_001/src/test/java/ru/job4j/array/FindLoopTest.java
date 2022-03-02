package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.FindLoop;

public class FindLoopTest {
    @Test
    public void whenFind() {
        int[] data = new int[] {0, 1, 2};
        int el = 1;
        int expected = 1;
        int out = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFound() {
        int[] data = new int[] {0, 1, 2, 3, 4, 5, 6};
        int el = 1;
        int start = 1;
        int finish = 4;
        int expected = 1;
        int out = FindLoop.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNotFound() {
        int[] data = new int[] {0, 1, 2, 3, 4, 5, 6};
        int el = 7;
        int start = 1;
        int finish = 4;
        int expected = -1;
        int out = FindLoop.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, out);
    }
}