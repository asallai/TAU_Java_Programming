package chapter7;

import java.util.Arrays;
import java.util.Random;

/*
ARRAYS:
Generate lottery ticket: Eliminates the duplication with BINARY SEARCH
 */
public class LotteryTicketWithBinarySearch {

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

            int randomNumber;

            /* Generate random number, then search to make sure it doesn't already exist
             in the array. If it does, regenerate and search again. */
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(lotteryNumbers, randomNumber));

            lotteryNumbers[i] = randomNumber;
        }
        return lotteryNumbers;
    }

    /**
     * Binary search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return True if found, false if not found
     */
    public static boolean search(int[] array, int numberToSearchFor) {
        // 1.Array must be sorted first
        Arrays.sort(array);
        // 2.Search for sorted array
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >=0)
            return true;
        else
            return false;
    }

    public static void printTicket(int[] lotteryNumbers) {

        System.out.println("Lottery numbers:");

        for(int i=0; i < LENGTH; i++) {
            System.out.print(lotteryNumbers[i] + " ");
        }
    }
}
