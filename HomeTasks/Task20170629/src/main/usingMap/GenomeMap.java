package main.usingMap;

import java.util.*;

public class GenomeMap {
    private int partLength;
    private String sequence;
    private static final byte[] BASIC = {'A', 'C', 'G', 'T'};
    private TreeMap<String, Integer> repeatedSortMap = new TreeMap<>();


    GenomeMap(int length, int partLength) {
        sequence = generateSequence(length);
        this.partLength = partLength;
    }


    public void sequencing() {
        char[] sec = sequence.toCharArray();   //массив для секвенации
        StringBuilder sb;

            for (int j = 0; j < sequence.length() - partLength + 1; j++) {
                sb = new StringBuilder();

                for (int k = j; k < j + partLength; k++) {
                    sb.append(sec[k]);
                }
                putIntoMap(sb);
            }

        System.out.println("");

        for (Map.Entry<String, Integer> entry : repeatedSortMap.entrySet()) {
            System.out.println(entry.getKey() + " repeat " + entry.getValue() + " times");
        }

    }

    private void putIntoMap(StringBuilder sb) {
        if (!repeatedSortMap.containsKey(sb.toString())) {
            repeatedSortMap.put(sb.toString(), 1);
        } else {
            repeatedSortMap.put(sb.toString(), repeatedSortMap.get(sb.toString()) + 1);
        }
    }


    private String generateSequence(int length) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) BASIC[rnd.nextInt(BASIC.length - 1)]);
        }
        System.out.println(sb);
        return sb.toString();
    }

}
