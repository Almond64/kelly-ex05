/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

/*
    This is a simple math project that asks the user for two numbers.
    The numbers are then added, subtracted, multiplied, and divided.
    The equations and results are outputted.
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        Inputs from the user will be strings.
        Convert the strings to integers before making calculations
        */
        System.out.println("What is the first number: ");
        String inputOne = input.next();
        int numberOne = Integer.parseInt(inputOne);
        System.out.println("What is the second number: ");
        String inputTwo = input.next();
        int numberTwo = Integer.parseInt(inputTwo);

        int sum = numberOne + numberTwo;
        System.out.printf("%d + %d = %d\n", numberOne, numberTwo, sum);

        int difference = numberOne - numberTwo;
        System.out.printf("%d - %d = %d\n", numberOne, numberTwo, difference);

        int product = numberOne * numberTwo;
        System.out.printf("%d * %d = %d\n", numberOne, numberTwo, product);

        int dividend = numberOne / numberTwo;
        System.out.printf("%d / %d = %d\n", numberOne, numberTwo, dividend);
    }
}
