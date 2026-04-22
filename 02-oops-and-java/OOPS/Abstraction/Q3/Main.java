import java.util.*;

// 1. Abstract class Login
abstract class Login {
    protected String username;
    protected String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Abstract method authenticate()
    abstract boolean authenticate();
}

// 2. Subclass: AdminLogin
class AdminLogin extends Login {
    public AdminLogin(String username, String password) {
        super(username, password);
    }

    @Override
    boolean authenticate() {
        // Input: Username: admin, Password: 1234
        return this.username.equals("admin") && this.password.equals("1234");
    }
}

// 3. Subclass: UserLogin
class UserLogin extends Login {
    public UserLogin(String username, String password) {
        super(username, password);
    }

    @Override
    boolean authenticate() {
        // Simple logic for normal user
        return this.username.equals("user") && this.password.equals("user123");
    }
}

// Main class to handle input/output
class Main {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Login System ---");
            System.out.println("Press 1 For Admin Login");
            System.out.println("Press 2 For User Login");
            System.out.println("Press 3 For Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 1 || choice == 2) {
                System.out.print("Enter Username: ");
                String user = sc.nextLine();
                System.out.print("Enter Password: ");
                String pass = sc.nextLine();

                Login loginObj = null;
                if (choice == 1) {
                    loginObj = new AdminLogin(user, pass);
                } else if (choice == 2) {
                    loginObj = new UserLogin(user, pass);
                }

                if (loginObj != null && loginObj.authenticate()) {
                    System.out.println("Login Successful");
                } else {
                    System.out.println("Login Failed");
                }
            }
        } while (choice != 3);
        
        System.out.println("Exiting System.");
        sc.close();
    }
}
