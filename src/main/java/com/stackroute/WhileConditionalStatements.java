package com.stackroute;

public class WhileConditionalStatements {

    public static void main(String[] args) {
        int[] input = {120, 60, 40, 55};
        int n = 0;
        //while conditional statement for array of int
        while (n < input.length) {
            if (input[n] > 100) {
                System.out.println("The number is greater than 100");
            } else if (input[n] > 50) {
                System.out.println("The number is greater than 50");
            } else {
                System.out.println("The number is less than 50");
            }
            n++;
        }

    }
}