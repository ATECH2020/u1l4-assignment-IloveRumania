import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourDegrees = scanner.nextInt();//Degrees of the hour hand.

         final int MINSINHR = 60;
         final int DEGINMIN = 6;
         final int DEGINHR = 30;
         

         int currentHourDegrees = hourDegrees % DEGINHR * 12;//For one degree the hour hand moves, the minute hand moves 12 degrees.
         //Degrees hr hand moved since last full hour.


        // closing the scanner object
        scanner.close();
    }
}