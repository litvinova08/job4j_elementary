package ru.job4j;

import job4j.Converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 300;
        int expected = 6;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 300;
        int exp = 5;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(exp, out);
    }
}