package chapter3;

import java.util.Scanner;

/*
SWITCH Statement
 */
public class GradeMessage {

    public static void main(String[] args ) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "E":
                message = "Oh-oh";
                break;
            case "F":
                message = "Uh";
                break;
            default:
                message = "Error! Invalid grade";
                break;
        }

/* NEW SWITCH IN JAVA:

        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "E" -> "Oh-oh";
            case "F" -> "Uh";
            default -> "Error! Invalid grade";
        };
*/

        System.out.println(message);
    }
}
