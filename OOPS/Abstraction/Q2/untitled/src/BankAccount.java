public abstract class BankAccount {
    protected int balance; //

    abstract String deposit(int amount);
    abstract String withdraw(int amount);

    String showBalance() {
        return "Balance is " + balance;
    }
}