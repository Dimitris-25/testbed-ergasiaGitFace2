package gr.aueb.cf.bankApp.model;

/**
 * Η κλάση JointAccount αντιπροσωπεύει έναν κοινό λογαριασμό με δύο κατόχους.
 */
public class JointAccount {
    private double balance;
    private String holder1;
    private String holder2;

    /**
     * Δημιουργεί έναν νέο κοινό λογαριασμό με δύο κατόχους και αρχικό υπόλοιπο.
     *
     * @param holder1        Το όνομα του πρώτου κατόχου.
     * @param holder2        Το όνομα του δεύτερου κατόχου.
     * @param initialBalance Το αρχικό υπόλοιπο του λογαριασμού.
     */
    public JointAccount(String holder1, String holder2, double initialBalance) {
        this.holder1 = holder1;
        this.holder2 = holder2;
        this.balance = initialBalance;
    }

    /**
     * Πραγματοποιεί ανάληψη από τον λογαριασμό.
     *
     * @param amount Το ποσό προς ανάληψη.
     * @return true αν η ανάληψη ήταν επιτυχής, false αν το υπόλοιπο δεν είναι επαρκές.
     */
    public boolean withdraw(double amount) {
        if (balance >= amount) {
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

    public String getHolder1() {
        return holder1;
    }

    public void setHolder1(String holder1) {
        this.holder1 = holder1;
    }

    public String getHolder2() {
        return holder2;
    }

    public void setHolder2(String holder2) {
        this.holder2 = holder2;
    }

    /**
     * Πραγματοποιεί κατάθεση στον λογαριασμό.
     *
     * @param amount Το ποσό προς κατάθεση.
     */
    public void deposit(double amount) {
        balance += amount;
    }

}
