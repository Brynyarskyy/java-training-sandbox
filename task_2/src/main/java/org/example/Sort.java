package org.example;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

    }

    public static int[] sort(int[] array) {
        int buffer = 0;
        boolean Sorted = false;
        while (!Sorted) {
            Sorted = true;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    Sorted = false;
                    buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                }
            }
        }

        return array;
    }
}
