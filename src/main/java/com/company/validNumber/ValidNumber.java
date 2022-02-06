package com.company.validNumber;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scan.nextInt();

        while (userInput < 1 || userInput > 10) {

            System.out.println("You must enter a number between 1 and 10. Please try again");

            System.out.println("Enter a number between 1 and 10: ");
            userInput = scan.nextInt();
        }

        System.out.print("\nThe number you entered is: " + userInput);

    }
}
