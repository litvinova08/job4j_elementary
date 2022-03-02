package ru.job4j.condition.loop;

import ru.job4j.loop.Fitness;
import org.junit.Assert;
import org.junit.Test;

public class FitnessTest {
    @Test
    public void when90and100() {
        int ivan = 90;
        int nik = 100;
        int expected = 1;
        int out = Fitness.competition(ivan, nik);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int result = Fitness.competition(ivan, nik);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}
