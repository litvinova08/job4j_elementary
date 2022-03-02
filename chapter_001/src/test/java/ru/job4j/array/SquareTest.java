package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.Square;

public class SquareTest {
    @Test
    public void whenSquare() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        Assert.assertArrayEquals(result, expected);
    }
}