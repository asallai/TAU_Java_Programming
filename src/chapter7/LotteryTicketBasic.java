package chapter7;

import java.util.Random;

/*
ARRAYS:
Generate lottery ticket: Basic solution which doesn't check the duplication.
 */
public class LotteryTicketBasic {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] lotteryNumbers = generateTicket();
        printTicket(lotteryNumbers);
    }

    public static int[] generateTicket() {

        int[] lotteryNumbers = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i < LENGTH; i++) {
            lotteryNumbers[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }
        return lotteryNumbers;
    }

    public static void printTicket(int[] lotteryNumbers) {

        System.out.println("Lottery numbers:");

        for(int i=0; i < LENGTH; i++) {
            System.out.print(lotteryNumbers[i] + " ");
        }
    }
}
