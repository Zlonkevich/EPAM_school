
public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(vacation == true)
            return true;
        else if(weekday == true)
            return false;
        return true;
    }

    void show(boolean b){
        System.out.println(b);
    }

    public static void main(String[] args) {
        SleepIn si = new SleepIn();

        si.show(si.sleepIn(false, false));
        si.show(si.sleepIn(true, false));
        si.show(si.sleepIn(false, true));

//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true
    }

}
