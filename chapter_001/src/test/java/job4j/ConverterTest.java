package job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenRuble140ThenEuro2() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 300;
        int ext = 5;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(out, ext);
    }
}