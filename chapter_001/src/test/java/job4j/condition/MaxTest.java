package job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenOne() {
        int one = 4;
        int two = 5;
        int expected = 5;
        int result = Max.max(one, two);
        Assert.assertEquals(expected, result);
    }

}