import java.util.Scanner;
import java.lang.Math;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int students1 = scanner.nextInt();
        int students2 = scanner.nextInt();
        int students3 = scanner.nextInt();

        /*
         *  your code goes here
         */
         double desks1 = students1 / 2.0;
         desks1 = (int)Math.round(desks1);
         double desks2 = students2 / 2.0;
         desks2 = (int)Math.round(desks2);
         double desks3 = students3 / 2.0;
         desks3 = (int)Math.round(desks3);
         int totalDesks = (int)desks1 + (int)desks2 + (int)desks3;
         System.out.print(totalDesks);

        // closing the scanner object
        scanner.close();
    }
}