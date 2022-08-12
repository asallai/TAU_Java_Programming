package chapter4;

import java.util.Scanner;

/*
 NESTED LOOPS:
 Find the average of each student's test score
*/
public class AverageTestScores {

    public static void main(String[] args) {

        // Initialize what we know
        int numberOfStudents = 10;
        int numberOfTests = 3;

        Scanner scanner = new Scanner(System.in);

        // Process all students
        for(int i=1; i <= numberOfStudents; i++) {

            System.out.println("Student #" + i);
            double total = 0;

            for(int j=1; j <= numberOfTests; j++) {
                System.out.println("Enter the #" + j + " score:");
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total / numberOfTests;
            System.out.println("The test average is " + average);
        }

        scanner.close();
    }
}
