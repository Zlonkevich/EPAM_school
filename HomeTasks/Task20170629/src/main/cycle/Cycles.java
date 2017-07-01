package main.cycle;


import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Cycles {
    private int partLength;
    private String sequence;
    private static final byte[] BASIC = {'A', 'C', 'G', 'T'};
    private TreeMap<String, Integer> repeatedSortMap = new TreeMap<>();

    Cycles(int length, int partLength) {
        sequence = getRandom(length);
        this.partLength = partLength;
    }


    /*
    метод на последующих кругах внешнего цикла все также продолжает добавлять в коллекцию
    повторяющиеся последовательности, не смотря на то, что они уже были учтены, как повторяющиеся!
    */

    public void sequencing() {
        char[] sec = sequence.toCharArray();   //массив для секвенации
        StringBuilder sb;

        for (int i = 0; i < sequence.length() - partLength; i++) {

            label1:
            for (int j = i + 1; j < sequence.length() - partLength + 1; j++) {

                sb = new StringBuilder();

                for (int k = j; k < j + partLength; k++) {

                    if (sec[k] != sec[k - j + i]) {
                        continue label1;
                    }
                    sb.append(sec[k]);
                }
                putIntoMap(sb);
            }
        }

        for (Map.Entry<String, Integer> entry : repeatedSortMap.entrySet()) {
            System.out.println("Sequence: " + entry.getKey() + " Repeat: " + entry.getValue());
        }
    }

    private void checkForSameSequence(StringBuilder sb) {
        if (!repeatedSortMap.containsKey(sb.toString())) {
            repeatedSortMap.put(sb.toString(), 1);
        }
    }


    private void putIntoMap(StringBuilder sb) {
        if (!repeatedSortMap.containsKey(sb.toString())) {
            repeatedSortMap.put(sb.toString(), 1);
        } else {
            repeatedSortMap.put(sb.toString(), repeatedSortMap.get(sb.toString()) + 1);
        }
    }


    private String getRandom(int length) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) BASIC[rnd.nextInt(BASIC.length - 1)]);
        }
        System.out.println(sb);
        return sb.toString();
    }

}
