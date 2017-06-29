package main;

public class Starter {
    public static void main(String[] args) {

        System.out.println(Calc.toBin(555));
        System.out.println(Calc.toHex(555));
        System.out.println(Calc.toOcto(555));

        System.out.println(Calc.toBin(-555));
        System.out.println(Calc.toHex(-555));
        System.out.println(Calc.toOcto(-555));

        System.out.println(Calc.toBin(0));
        System.out.println(Calc.toHex(0));
        System.out.println(Calc.toOcto(0));


    }
}
