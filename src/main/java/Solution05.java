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
        System.out.println("What is the first number: ");
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        System.out.println("What is the second number: ");
        int numberTwo = input.nextInt();

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
