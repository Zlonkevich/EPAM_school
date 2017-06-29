package main;


public class Calc {

    public static String toBin(int a) {
        StringBuilder res = new StringBuilder();
        int b;
        int sign = a;

        if (a < 0) {
            a = a * (-1);
        } else if (a == 0) {
            return "0";
        }

        while (a != 0) {
            b = a % 2;
            res.append(b);
            a = a / 2;
        }

        if (sign < 0) {
            res.append("-");
        }
        res.reverse();
        return res.toString();
    }

    public static String toOcto(int a) {
        StringBuilder res = new StringBuilder();
        int sign = a;
        int b;

        if (a < 0) {
            a = a * (-1);
        } else if (a == 0) {
            return "0";
        }


        while (a != 0) {
            b = a % 8;
            res.append(b);
            a = a / 8;
        }

        if (sign < 0) {
            res.append("-");
        }

        res.reverse();
        return res.toString();
    }


    public static String toHex(int a) {
        StringBuilder res = new StringBuilder();
        int b;
        int sign = a;

        if (a < 0) {
            a = a * (-1);
        } else if (a == 0) {
            return "0";
        }

        while (a != 0) {
            b = a % 16;
            res.append(hex(b));
            a = a / 16;
        }

        if (sign < 0) {
            res.append("-");
        }
        res.reverse();
        return res.toString();
    }


    private static String hex(int i) {
        switch (i) {
            case 10:
                return "a";
            case 11:
                return "b";
            case 12:
                return "c";
            case 13:
                return "d";
            case 14:
                return "e";
            case 15:
                return "f";
        }
        return ((Integer) i).toString();
    }
}
