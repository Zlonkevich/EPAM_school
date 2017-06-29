package main;


public class Calc {

    public static String toBin(int a) {
        StringBuilder res = new StringBuilder();
        int b;

        if(a < 0){
            res.append('-');
        }else if(a == 0){
            return "0";
        }

        while ( a != 0){
            b = a % 2;
            res.append(b);
            a = a / 2;
        }
        res.reverse();
        return res.toString();
    }

    public static String toOcto(int a) {
        StringBuilder res = new StringBuilder();
        int b;

        if(a < 0){
            res.append('-');
        }else if(a == 0){
            return "0";
        }



        while(a != 0){
            b = a % 8;
            res.append(b);
            a = a / 8;
        }
        res.reverse();
        return res.toString();
    }



    public static String toHex(int a) {
        StringBuilder res = new StringBuilder();
        int b;

        if(a < 0){
            res.append('-');
        }else if(a == 0){
            return "0";
        }

        while(a != 0){
            b = a % 16;
            res.append(hex(b));
            a = a / 16;
        }
        res.reverse();
        return res.toString();
    }


    private static String hex(int i){
        switch (i) {
            case 10: return "a";
            case 11: return "b";
            case 12: return "c";
            case 13: return "d";
            case 14: return "e";
            case 15: return "f";
        }
        return ((Integer)i).toString();
    }
}
