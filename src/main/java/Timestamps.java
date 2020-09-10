import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int secInHour1, secInHour2;
        int secInMins1, secInMins2;
        int total1, total2;
        int diff;

        /*
         *  your code goes here
         */
           secInHour1 = hours1 * 3600;
           secInHour2 = hours2 * 3600;
           secInMins1 = minutes1 * 60;
           secInMins2 = minutes2 * 60;
           total1 = secInHour1 + secInMins1 + seconds1;
           total2 = secInHour2 + secInMins2 + seconds2;
           diff = total2 - total1;
           System.out.print(diff);


        // closing the scanner object
        scanner.close();
    }
}