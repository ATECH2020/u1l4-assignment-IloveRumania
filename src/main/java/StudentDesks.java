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
         desks1 = Math.round(desks1);
         double desks2 = students2 / 2.0;
         desks2 = Math.round(desks2);
         double desks3 = students3 / 2.0;
         desks3 = Math.round(desks3);
         double totalDesks = desks1 + desks2 + desks3;
         System.out.println(totalDesks);
         //This can only work if I use doubles.
        // closing the scanner object
        scanner.close();
    }
}