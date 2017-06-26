package main;

public class IsPrime {

    public static boolean isPrime(int a){
        if(a % 2 != 0 || a % 3 != 0)
            return true;
        return false;
    }
}
