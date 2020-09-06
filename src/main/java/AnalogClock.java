import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int mins1 = scanner.nextInt();

        /*
         *  your code goes here
         */
         final int MINSINHR = 60;
         final int DEGINMIN = 6;
         int mins2 = mins1 % MINSINHR;
         int mins3 = mins2 * DEGINMIN;
         System.out.println(mins3);
        // closing the scanner object
        scanner.close();
    }
}