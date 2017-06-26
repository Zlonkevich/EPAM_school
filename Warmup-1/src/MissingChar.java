
public class MissingChar {

    public String missingChar(String str, int n) {
        String newStr;
        if(n == 0)
            return newStr = str.substring(n+1, str.length());
        newStr = str.substring(0, n) + str.substring(n+1, str.length());
        return newStr;
    }

    public static void main(String[] args) {
        MissingChar mc = new MissingChar();
        System.out.println(mc.missingChar("kitten", 1));
        System.out.println(mc.missingChar("kitten", 0));
        System.out.println(mc.missingChar("kitten", 4));



//        missingChar("kitten", 1) → "ktten"
//        missingChar("kitten", 0) → "itten"
//        missingChar("kitten", 4) → "kittn"
    }
}
