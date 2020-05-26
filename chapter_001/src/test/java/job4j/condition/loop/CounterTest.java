package job4j.condition.loop;

import job4j.loop.Counter;
import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEven() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }
}
