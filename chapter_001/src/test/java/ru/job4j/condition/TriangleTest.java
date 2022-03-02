package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Triangle;

public class TriangleTest {
    @Test
    public void whenEqual() {
        int ab = 2;
        int ac = 4;
        int bc = 3;
        boolean result = Triangle.check(ab, ac, bc);
        Assert.assertTrue(result);
    }
}
