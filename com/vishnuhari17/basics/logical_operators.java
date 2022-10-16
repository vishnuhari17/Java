package com.vishnuhari17.basics;

import java.util.Scanner;

public class logical_operators {

    /*Logical operators: && and
                         || or
                         ! not
     */
    public static void main(String[] args) {
        int temp =10;
        if(temp>30){
            System.out.println("It's hot outside!");
        }
        else if(temp>20 && temp<=30) {
            System.out.println("It's warm outside");
        }
        else{
            System.out.println("It's cold outside");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game press q or Q to quit");
        String responce = scanner.next();

        if(!responce.equals("q") && !responce.equals("Q")){
            System.out.println("You are still playing *pew pew*");
        }
        else {
            System.out.println("You quited the game");
        }

    }
}





