import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean validChoice = false;

        while (!validChoice) {
            displayMenu();
            try {
                choice = getChoice(scanner);
                printChoice(choice);
                validChoice = true; // Exit the loop if the choice is valid
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    // Μέθοδος για την εμφάνιση του μενού
    public static void displayMenu() {
        System.out.println("Please select an option:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Exit");
    }

    // Μέθοδος για την ανάγνωση της επιλογής του χρήστη
    public static int getChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
            scanner.next(); // Καθαρισμός της μη έγκυρης εισόδου
        }
        return scanner.nextInt();
    }

    // Μέθοδος για την εκτύπωση της επιλογής και έλεγχο της εγκυρότητας
    public static void printChoice(int choice) {
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 5.");
        }
        switch (choice) {
            case 1:
                System.out.println("You selected option 1.");
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            case 4:
                System.out.println("You selected option 4.");
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                // Δεν θα πρέπει να φτάσει εδώ ποτέ λόγω του παραπάνω ελέγχου.
                throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 5.");
        }
    }
}