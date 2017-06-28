package test.java;

import main.Sign;
import org.junit.Assert;
import org.junit.Test;

public class SignTest extends Assert{


    @Test
    public void positive() throws Exception {
        assertTrue(Sign.sign(1) == 1);
        assertTrue(Sign.sign(100) == 1);
        assertTrue(Sign.sign(Integer.MAX_VALUE) == 1);
    }

    @Test
    public void negative() throws Exception {
        assertTrue(Sign.sign(-1) == -1);
        assertTrue(Sign.sign(-100) == -1);
        assertTrue(Sign.sign(Integer.MIN_VALUE) == -1);
    }

    @Test
    public void zero() throws Exception {
        assertTrue(Sign.sign(0) == 0);
    }
}
