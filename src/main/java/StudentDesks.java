import java.util.Scanner;

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
         int desks1 = students1 / 2;
         int desks2 = students2 / 2;
         int desks3 = students3 / 2;
         System.out.println(Math.round(desks1));
         System.out.println(Math.round(desks2));
         System.out.println(Math.round(desks3));

        // closing the scanner object
        scanner.close();
    }
}