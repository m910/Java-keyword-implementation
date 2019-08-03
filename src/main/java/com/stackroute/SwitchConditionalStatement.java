package com.stackroute;

import java.util.Scanner;

public class SwitchConditionalStatement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input");
        int input = scan.nextInt();
        String day;
//switch conditional statement using int data type
        switch (input) {
            case 1:
                day = "Monday";
                break;

            case 2:
                day = "Tuesday";
                break;

            case 3:
                day = "Wednesday";
                break;


            case 4:
                day = "Thursday";
                break;


            case 5:
                day = "Friday";
                break;


            case 6:
                day = "Saturday";
                break;

            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid input";
                break;

        }
        System.out.println(day);

    }
}
