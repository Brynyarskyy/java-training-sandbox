package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UserList {
    int id;
    String name;

    public UserList(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<UserList> data = new ArrayList<>();
        boolean stop = false;
        int id1 = 0;
        while (!stop) {
            id1++;
            Scanner scan = new Scanner(System.in);
            String list = scan.next();
            switch (list) {
                case "list":
                    for (int i = 0; i < data.size(); i++) {
                        System.out.println(data.get(i).id + " " + data.get(i).name);
                    }
                    id1--;
                    break;
                case "exit":
                    stop = true;
                    break;
                default:
                    data.add(new UserList(id1, list));
                    break;
            }
        }
    }

}
