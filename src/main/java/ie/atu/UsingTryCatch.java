package ie.atu;

import java.util.Scanner;

public class UsingTryCatch {

    public static void main(String[] args) {

        while(true) {
            try {
                System.out.println("Please enter a number between 0 - 9 :");
                Scanner myscan = new Scanner(System.in);

                // Read user input as a Strong
                String input = myscan.nextLine();

                // Parse the input to an interger
                int myNum = Integer.parseInt(input);

                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You entered " + myNum);
                    break;
                }
                else{
                    System.out.println("Not a valid number,");
                }
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number, enter only a value between 0 - 9");
            }
        }
    }
}
