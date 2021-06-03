/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Write a program that converts currency. Specifically, convert euros to U.S. dollars.
 Prompt for the amount of money in euros you have, and
 prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars.

The formula for currency conversion is

amount_to = (amount_from * rate_from) / rate_towhere

amount_to is the amount in U.S. dollars.
amount_from is the amount in euros.
rate_from is the current exchange rate in euros.
rate_to is the current exchange rate of the U.S. dollar.

Example Output
How many euros are you exchanging? 81
What is the exchange rate? 137.51
81 euros at an exchange rate of 137.51 is
111.38 U.S. dollars.

Constraints
Ensure that fractions of a cent are rounded up to the next penny.
Use a single output statement.
 */
package Exercise_11;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");

        int euros = input.nextInt();

        System.out.print("What is the exchange rate? ");

        double rate = input.nextDouble();

        double dollar = (euros * rate) / 100;

        System.out.printf("\n%d euros at an exchange rate of %.2f is %.2f U.S. dollars", euros, rate, dollar);
    }
}
