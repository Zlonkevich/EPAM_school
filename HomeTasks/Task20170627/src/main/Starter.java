package main;

public class Starter {
    public static void main(String[] args) {

        System.out.println(Calc.toBin(123));
        System.out.println(Calc.toHex(123));
        System.out.println(Calc.toOcto(123));

        System.out.println(Calc.toBin(-123));
        System.out.println(Calc.toHex(-123));
        System.out.println(Calc.toOcto(-123));

        System.out.println(Calc.toBin(0));
        System.out.println(Calc.toHex(0));
        System.out.println(Calc.toOcto(0));
    }
}
