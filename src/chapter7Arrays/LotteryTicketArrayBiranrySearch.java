package chapter7Arrays;
// This will always have almost 1 half having duplicates.
import java.util.Arrays;
import java.util.Random;

public class LotteryTicketArrayBiranrySearch {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER=69;

    public static void main(String[] args) {
        int ticket [] = generateNumber();
        printTicket(ticket);
    }

    public static int[] generateNumber(){
        int ticket []= new int[LENGTH];
        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNumber;

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
            }while (search(ticket,randomNumber));

            ticket[i]= randomNumber;

        }
        return ticket;
    }

    /**
     *
      * @param array This is the array which needs to be searched
     * @param numberToSearchFor Number that needs to be searched for in the array
     * @return Return true if number is found and false if not found
     */
    public static boolean search(int array[], int numberToSearchFor){
//        For binary search primary condition is array should be sorted
        Arrays.sort(array);
       int index= Arrays.binarySearch(array,numberToSearchFor);
        if(index >=0){
            return true;
        }
        return false;

    }


    public static void printTicket(int ticket[]){
        for (int i=0; i<LENGTH; i++){
            System.out.print(ticket[i]+ " | ");
        }
    }
}
