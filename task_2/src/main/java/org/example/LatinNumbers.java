package org.example;

import java.util.Arrays;

public class LatinNumbers {
    public static void main(String[] args) {
        System.out.println(convert("XV"));
    }

    public static int convert(String latin) {
        int sum = 0;
        char[] str = latin.toCharArray();
        int[] arr = new int[latin.length()];
        for (int i = 0; i < arr.length; i++) {
            switch (str[i]) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
                    break;
                default:
                    arr[i] = 0;
                    break;
            }
        }
        if (arr.length > 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] >= arr[i + 1]) sum = sum + arr[i];
                else sum -= arr[i];
                            }
            sum+= arr[arr.length-1];
        } else sum = arr[0];
        return sum;
    }

}
