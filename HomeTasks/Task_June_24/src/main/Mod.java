package main;

public class Mod {

    public static int mod(int a, int b) {
        int sign = 1;
        if (a == 0)
            return 0;
        else {
            sign = a / Math.abs(a) * b / Math.abs(b);
        }

        int result = a;

        if (Math.abs(a) >= Math.abs(b)) {
            while (Math.abs(result) >= Math.abs(b)) {
                result = Math.abs(result) - Math.abs(b);
            }
            return result * sign;
        } else return a;


    }
}
