import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount();

        System.out.println("Choose The Account Type:");
        String acType = sc.nextLine();

        AccountType type = AccountType.valueOf(acType);

        if (type == null) {
            System.out.println("Invalid account type");
            return;
        }

        if (type == AccountType.SAVING) {
            handleSavingAccount(sc, savingsAccount);
        } else if (type == AccountType.CURRENT) {
            System.out.println("Current Account Selected");
            System.out.println(savingsAccount.showBalance());
        }
    }

    // ✅ OUTSIDE main
    private static void handleSavingAccount(Scanner sc, SavingsAccount acc) {

        System.out.println(acc.showBalance());

        System.out.println("Press 1 For Deposit:");
        System.out.println("Press 2 For Withdraw:");

        int press = sc.nextInt();

        switch (press) {
            case 1:
                System.out.println("Enter amount to deposit:");
                int add = sc.nextInt();
                System.out.println(acc.deposit(add)); // 🔥 print result
                System.out.println(acc.showBalance());
                break;

            case 2:
                System.out.println("Enter amount to withdraw:");
                int sub = sc.nextInt();
                System.out.println(acc.withdraw(sub)); // 🔥 print result
                System.out.println(acc.showBalance());
                break;

            default:
                System.out.println("Invalid option");
        }
    }
}