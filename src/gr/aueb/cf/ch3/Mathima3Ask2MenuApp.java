package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Να φτιαξουμε ενα προγραμμα οπου ο χρηστης να εισαιγει ενα αριθμο 1-5.
 * Για τους αριθμους 1-4 θα εμφανιζετια μενου επιλογων.
 * Οταν εισαγει το 5 θα σταματαει το προγραμμα να εκτελειται.
// */
public class Mathima3Ask2MenuApp   {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numChoise = 0;

        do {
            System.out.println("Επιλεξτε εναν αριθμο απο 1-5 για καθε μια απο τις παρακατω επιλογες: 1.Εισαγωγη, 2.Διαγραφη, 3.Ενημερωση, 4.Αναζητηση 5.Εξοδος");
            numChoise = in.nextInt();
            if (numChoise == 1) {
                System.out.println("Επιλεξατε 1  εισαγωγη");
            }
            if (numChoise == 2) {
                System.out.println("Επιλεξατε 2  Διαγραφη");
            }
            if (numChoise == 3) {
                System.out.println("Επιλεξατε 3 Ενημερωση");
            }
            if (numChoise == 4) {
                System.out.println("Επιλεξατε 4 Αναζητηση");
            }
            if (numChoise == 5) {
                System.out.println("Επιλεξατε 5  Εξοδος");
                if (numChoise == 5) {
                    System.out.println("Εξοδος");
                    System.exit(1);
                }
            }
            if (numChoise > 5 || numChoise < 1) {
                System.out.println("Error, παρακαλω επιλεξτε εναν αριθμο απο 1-5");
            }
        }while (true);



    }
}

