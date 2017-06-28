package test.java;

import main.IsPrime;
import org.junit.Assert;
import org.junit.Test;

public class IsPrimeTest extends Assert {

    @Test
    public void isPrimeTest(){
        assertTrue(IsPrime.isPrime(2));
        assertTrue(IsPrime.isPrime(3));
        assertTrue(IsPrime.isPrime(5));
        assertTrue(IsPrime.isPrime(7));
        assertTrue(IsPrime.isPrime(11));
        assertTrue(IsPrime.isPrime(13));
        assertTrue(IsPrime.isPrime(17));
        assertTrue(IsPrime.isPrime(19));
        assertTrue(IsPrime.isPrime(23));
        assertTrue(IsPrime.isPrime(29));
        assertTrue(IsPrime.isPrime(31));
    }

}
