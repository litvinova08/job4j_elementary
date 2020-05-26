package job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {
    @Test
    public void whenBuy() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String result = DummyBot.answer(in);
        Assert.assertEquals(result, expected);
    }

}