package main;


public class IsFibonacci {

    public static boolean isFibonacci(int f) {
        int a = 0;
        int b = 1;
        int c = 0;
        while (c != 1836311903) {
            c = a + b;
            if (f == c)
                return true;
            a = b;
            b = c;
        }

        return false;
    }

    public static int fibonacci(int f) {
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i < f; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

        return c;
    }
}
