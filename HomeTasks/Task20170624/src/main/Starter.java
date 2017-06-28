package main;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Starter {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE % (-Integer.MAX_VALUE);
        int b = Integer.MAX_VALUE % (-Integer.MIN_VALUE);
        int c = Integer.MIN_VALUE % (-Integer.MAX_VALUE);
        int d = Integer.MIN_VALUE % (-Integer.MIN_VALUE);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

//        JUnitCore runner = new JUnitCore();
//        Result result = runner.run(Sign.class);
//        System.out.println("run tests: " + result.getRunCount());
//        System.out.println("failed tests: " + result.getFailureCount());
//        System.out.println("ignored tests: " + result.getIgnoreCount());
//        System.out.println("success: " + result.wasSuccessful());
    }
}
