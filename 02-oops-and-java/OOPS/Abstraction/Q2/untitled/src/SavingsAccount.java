public class SavingsAccount extends BankAccount {

    @Override
    String deposit(int amount) {
        if (amount <= 0) {
            return "Invalid deposit amount";
        }

        balance += amount; // 🔥 correct logic
        return "Deposited: " + amount;
    }

    @Override
    String withdraw(int amount) {
        if (amount <= 0) {
            return "Invalid withdraw amount";
        }

        if (amount > balance) {
            return "Insufficient balance";
        }

        balance -= amount;
        return "Withdrawn: " + amount;
    }
}