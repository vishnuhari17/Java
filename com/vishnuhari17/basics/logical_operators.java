package com.vishnuhari17.basics;

public class logical_operators {
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
    }
}
