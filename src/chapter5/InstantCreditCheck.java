package chapter5;

import java.util.Scanner;

/*
 VARIABLE SCOPE
 Write an 'instant credit check' program that approves anyone
 who makes more than $25,000 and has a credit score of 700 or better.
 Reject all others.
*/
public class InstantCreditCheck {

    static Scanner scanner;
    static  double salary;
    static int creditScore;
    static boolean qualified;

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    public static void main(String[] args){

        scanner = new Scanner(System.in);
        salary = getSalary();
        creditScore = getCreditScore();
        scanner.close();

        qualified = isUserQualified();
        notifyUser();
    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        return scanner.nextInt();
    }

    public static boolean isUserQualified() {
        return creditScore >= requiredSalary && salary >= requiredCreditScore;
    }

    public static void notifyUser() {
        if(qualified)
            System.out.println("Congrats! You've been approved.");
         else
            System.out.println("Sorry. You've been declined");
    }
}
