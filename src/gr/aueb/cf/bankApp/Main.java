package gr.aueb.cf.bankApp;

import gr.aueb.cf.bankApp.model.JointAccount;
import gr.aueb.cf.bankApp.model.OverDraftAccount;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία λογαριασμού υπερανάληψης
        OverDraftAccount overdraftAccount = new OverDraftAccount(1000.0, 500.0);
        System.out.println("Αρχικό υπόλοιπο λογαριασμού υπερανάληψης: " + overdraftAccount.OverDraftAccountToString());

        try {
            boolean result = overdraftAccount.withdraw(1200.0);
            if (result) {
                System.out.println("Υπόλοιπο μετά από ανάληψη 1200: " + overdraftAccount.getBalance());
            } else {
                System.out.println("Ανάληψη αποτυχημένη: Υπερβαίνει το όριο υπερανάληψης!");
            }
        } catch (Exception e) {
            System.out.println("Σφάλμα κατά την ανάληψη: " + e.getMessage());
        }

        overdraftAccount.deposit(300.0);
        System.out.println("Υπόλοιπο μετά από κατάθεση 300: " + overdraftAccount.getBalance());

        // Δημιουργία κοινού λογαριασμού
        JointAccount jointAccount = new JointAccount("Άρης", "Μαρία", 1500.0);
        System.out.println("Αρχικό υπόλοιπο κοινού λογαριασμού: " + jointAccount.getBalance());

        try {
            boolean result = jointAccount.withdraw(200.0);
            if (result) {
                System.out.println("Υπόλοιπο μετά από ανάληψη 200: " + jointAccount.getBalance());
            } else {
                System.out.println("Ανάληψη αποτυχημένη: Ανεπαρκές υπόλοιπο!");
            }
        } catch (Exception e) {
            System.out.println("Σφάλμα κατά την ανάληψη: " + e.getMessage());
        }

        jointAccount.deposit(500.0);
        System.out.println("Υπόλοιπο μετά από κατάθεση 500: " + jointAccount.getBalance());
    }
}bed

