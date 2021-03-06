package main;


import java.util.Random;

public class Cycles {
    private int partLength;
    private String sequence;
    private static final byte[] BASIC = {'A', 'B', 'C', 'D'};

    Cycles(int  length, int partLength) {
        sequence = getRandom(length);
        this.partLength = partLength;
    }

    public void sequencing() {
        char [] sec = sequence.toCharArray();   //массив для секвенации
        StringBuilder sb;

        for (int i = 0; i < sequence.length() - partLength; i++) {
            label1:
            for (int j = i + 1; j < sequence.length() - partLength + 1; j++) {
                sb = new StringBuilder();

                for (int k = j; k < j + partLength; k++) {
                    if (sec[k] != sec[k - j + i]){
                        continue label1;
                    }
                    sb.append(sec[k]);
                }
                System.out.println(sb);
            }
        }
    }




    private String getRandom(int length) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) BASIC[rnd.nextInt(BASIC.length -1)]);
        }
        System.out.println(sb);
        return sb.toString();
    }

}
