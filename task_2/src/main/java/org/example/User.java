package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    int id;
    String name;
    static int lastId = 0;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        lastId = id;
    }



}




