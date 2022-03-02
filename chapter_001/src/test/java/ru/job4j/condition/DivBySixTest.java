package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.DivBySix;

public class DivBySixTest {
    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DivBySix.checkNumber(in);
        String expected = "Исходное число делится на 6.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DivBySix.checkNumber(in);
        String expected = "Исходное число делится на 3, но не является четным.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DivBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3, но является четным.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DivBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3 и не является четным.";
        Assert.assertEquals(expected, result);
    }
}