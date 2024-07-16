package gr.aueb.cf.ch3;
import java.util.Scanner;

/**
 * Να φτιαξουμε ενα προγραμμα που να ελεγχει αν
 * ενα ετος που θα βαζει ο χρηστης ειναι δισεκτο.
 */

public class Mathima3BoolWhileAskLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;


        while (true) {
            System.out.println("Please insert the year");
            num1 = in.nextInt();
            num2 = 4;
            num3 = 100;
            num4 = 400;
            if (num1 % num2 == 0 && num1 % num3 != 0) {
                System.out.println("Is a leap year");
                break;
            }
            if (num1 % num4 == 0) {
                System.out.println("Is a leap year");
            }
            else {
                System.out.println("Isn't a leap year");
                break;
            }
        }

    }
}
