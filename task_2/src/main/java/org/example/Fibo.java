package org.example;

public class Fibo {
    public static void main(String[] args) {}

       public static int fibo(int i) {
              if (i==1 || i==2) {
                  return 1;}
              else {
            int a1, a2, buffer;
                  a1 = 1; // перше число фібоначі
                  a2 = 1; // друге число фібоначі
            for (int j=3;j<=i;j++) {
              buffer = a2; // зберігаємо останнє відоме значення
                a2 = a1 + a2; // записуємо нове значення (наступне)/посуваємо комірку
                a1 = buffer;
            }
                  return a2;
        }

    }

}
