import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter balance: ");
            double balance = scanner.nextDouble();
            
            System.out.print("Enter withdraw amount: ");
            double amount = scanner.nextDouble();
            
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient Balance Exception");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful! Remaining balance: " + balance);
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}
