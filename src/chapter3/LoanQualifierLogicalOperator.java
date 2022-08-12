package chapter3;

import java.util.Scanner;

/*
LOGICAL OPERATORS:
To qualify for a loan, a person must take at least $30,000
and have been working at their current job for at least 2 years.
 */
public class LoanQualifierLogicalOperator {

    public static void main (String[] args) {

        // Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsWorked = 2;

        // Get what we don't
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        // Make decision
        if(salary >= requiredSalary && years >= requiredYearsWorked) {
                System.out.println("Congrats! You qualify for the loan");
        }
        else{
            System.out.println("Sorry, you don't qualify for the loan");
        }
    }
}
