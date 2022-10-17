package com.vishnuhari17.basics;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        /*
        while(name.isBlank()){
            System.out.print("Enter your name");
            name = scanner.nextLine();
        }
        */

        do {
            System.out.println("Enter your name");
            name = scanner.nextLine();
        } while (name.isBlank());

        System.out.println("Hello "+name);
    }

}
