package chapter4;

import java.util.Scanner;

/*
 FOR LOOP:
 Write a cashier program that will scan a given number of items and tally the cost.
*/
public class Cashier {

    public static void main(String[] args) {

        double total = 0;
        Scanner scanner = new Scanner(System.in);

        // Get number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        int quantity = scanner.nextInt();

        // Create loop to iterate through all of the items and accumulate the cost.
        for(int i=1; i <= quantity; i++) {

            System.out.println("Enter the price of the " + i +".item:");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is $" + total);
    }
}
