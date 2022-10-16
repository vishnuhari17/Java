package com.vishnuhari17.basics;

public class switch_case {

    public static void main(String[] args) {

        //Switch is a statement that allows us to test the equality of a variable against a list of values

        String day = "pizza";

        switch (day){
            case "Monday" :
                System.out.println("It's a Monday");
                break;
            case "Tuesday":
                System.out.println("It's a Tuesday");
                break;
            case "Wednesday" :
                System.out.println("It's a Wednesday");
                break;
            case "Thursday" :
                System.out.println("It's a Thursday");
                break;
            case "Friday" :
                System.out.println("It's a Friday");
                break;
            case "Saturday" :
                System.out.println("It's a Saturday");
                break;
            case "Sunday" :
                System.out.println("It's a Sunday");
                break;
            default:
                System.out.println("It's not a day! :/");


        }


    }
}

