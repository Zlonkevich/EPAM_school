

public class NearHundred {

    public boolean nearHundred(int n) {
        if((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10))
            return true;

        return false;
    }

    void show(boolean t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        NearHundred nh = new NearHundred();

        nh.show(nh.nearHundred(93));
        nh.show(nh.nearHundred(90));
        nh.show(nh.nearHundred(89));
        nh.show(nh.nearHundred(198));
        nh.show(nh.nearHundred(180));




//        nearHundred(93) → true
//        nearHundred(90) → true
//        nearHundred(89) → false
    }
}
