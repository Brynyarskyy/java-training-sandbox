package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int id1 = User.lastId;
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        boolean stop = false;
        while (!stop) {
            id1++;
            Scanner scan = new Scanner(System.in);
            String list = scan.next();
            switch (list) {
                case "list":
                    for (int i = 0; i < user.size(); i++) {
                        System.out.println(user.get(i).id + " " + user.get(i).name);
                    }
                    id1--;
                    break;
                case "exit":
                    stop = true;
                    id1--;
                    break;
                default:
                    user.add(new User(id1, list));
                    break;
            }
           }
        User.lastId=id1;
    }
}