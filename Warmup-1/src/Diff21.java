/**
 * Created by Fedor on 21.06.2017.
 */
public class Diff21 {

    public int diff21(int n) {
        System.out.println(Math.abs(21 - n));
        if (n > 21)
            return 2 * (n - 21);
        return Math.abs(n - 21);
    }

    public static void main(String[] args) {
        Diff21 d = new Diff21();

        d.diff21(19);
        d.diff21(10);
        d.diff21(21);
    }
}
