package org.example;

public class Sequence {
    public static void main(String[] args) {

    }

    public static boolean isValid(int[] sequence) {
        for (int i = 0; i < sequence.length - 1; i++) {
            if (isBigger(sequence[i], sequence[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBigger(int i, int j) {
        return  (i > j);


    }
}