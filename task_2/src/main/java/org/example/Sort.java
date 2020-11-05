package org.example;

import java.util.Arrays;

 class Sort {
    public int a = 0;
     public static  int b = 0;
    public  void test1(){
        System.out.println(b);
    }
      public static void main(String[] args) {
Point point1 = new Point();
Point point2 = new Point();
point1.setX(1);
point1.setZ(1);
          System.out.println(point1);
point2.setZ(2);


System.out.println(point2);
    }

    public static int[] sort(int[] array) {
        int buffer = 0;
         boolean sorted = false;
        while (!sorted) {
            sorted = true;
            int a = 0;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    sorted = false;
                    buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                }

            }
        }

        return array;
    }
}


