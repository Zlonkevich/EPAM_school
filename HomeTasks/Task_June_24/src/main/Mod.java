package main;

public class Mod {

    public static int mod(int a, int b) {
        int c = a / b;
        int ost = a - c * b;

//        int ost = a % b;

        return ost;

    }
}
