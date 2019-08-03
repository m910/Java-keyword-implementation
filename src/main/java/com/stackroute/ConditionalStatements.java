package com.stackroute;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = scan.nextInt();
    //if conditional statement with int data type
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }


    }
}
