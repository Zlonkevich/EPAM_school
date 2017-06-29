package test.java;

import main.IsFibonacci;
import org.junit.Assert;
import org.junit.Test;

public class IsFibonacciTest extends Assert{

    @Test
    public void isFibonacciTest(){
        assertTrue(IsFibonacci.isFibonacci(1));
        assertTrue(IsFibonacci.isFibonacci(2));
        assertTrue(IsFibonacci.isFibonacci(3));
        assertTrue(IsFibonacci.isFibonacci(5));
        assertTrue(IsFibonacci.isFibonacci(8));
        assertTrue(IsFibonacci.isFibonacci(13));
        assertTrue(IsFibonacci.isFibonacci(21));
        assertTrue(IsFibonacci.isFibonacci(34));
        assertTrue(IsFibonacci.isFibonacci(55));
        assertTrue(IsFibonacci.isFibonacci(1346269));

        assertFalse(IsFibonacci.isFibonacci(4));
        assertFalse(IsFibonacci.isFibonacci(6));
        assertFalse(IsFibonacci.isFibonacci(7));
        assertFalse(IsFibonacci.isFibonacci(9));
        assertFalse(IsFibonacci.isFibonacci(15));
        assertFalse(IsFibonacci.isFibonacci(1346270));

    }
}
