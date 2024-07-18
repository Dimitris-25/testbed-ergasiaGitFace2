package gr.aueb.cf.bankApp.model;

public class OverDraftAccount {
    private double balance;
    private double overdraftLimit;


    public OverDraftAccount() {

    }

    public OverDraftAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Δημιουργεί έναν νέο λογαριασμό υπερανάληψης με αρχικό υπόλοιπο και όριο υπερανάληψης.
     *
     * @param initialBalance  Το αρχικό υπόλοιπο του λογαριασμού.
     * @param overdraftLimit  Το όριο υπερανάληψης του λογαριασμού.
     */


    /**
     * Πραγματοποιεί ανάληψη από τον λογαριασμό.
     *
     * @param amount Το ποσό προς ανάληψη.
     * @return true αν η ανάληψη ήταν επιτυχής, false αν η ανάληψη υπερβαίνει το όριο υπερανάληψης.
     */
    public boolean withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Επιστρέφει το τρέχον υπόλοιπο του λογαριασμού.
     */


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Πραγματοποιεί κατάθεση στον λογαριασμό.
     *
     * @param amount Το ποσό προς κατάθεση.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    public String OverDraftAccountToString() {

        return  "(" + balance + ")";
    }

}



