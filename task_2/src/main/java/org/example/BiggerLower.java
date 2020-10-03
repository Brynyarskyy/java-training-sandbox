package org.example;

public class BiggerLower {
    public static void main(String[] args) {

    }

    /*
     * Method make decision if i is bigger that j
     */
    public static boolean isBigger(int i, int j) {
        return i>j;
    }

    /*
     * Method make decision if i is lower that j
     */
    public static boolean isLower(int a, int b) {
        return !isBigger(a,b);
    }
}