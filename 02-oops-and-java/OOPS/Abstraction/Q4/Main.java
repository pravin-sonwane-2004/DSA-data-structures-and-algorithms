// Question 59: Create abstract class Loan.
// Abstract method calculateInterest().
// Subclasses:

// HomeLoan

// CarLoan

// Input
// Amount: 100000
// Rate: 8%
// Output
// Interest: 8000

import java.util.*;

interface Loan {
	double calculateInterest(double amount , double rateOfIntrest);
}



class HomeLoan implements Loan{
	
	public  double calculateInterest(double amount , double rateOfIntrest) {
		 return amount*rateOfIntrest/100;
	}
}

class CarLoan implements Loan{
	
	public  double calculateInterest(double amount , double rateOfIntrest) {
		 return amount*rateOfIntrest/100;
	}
}

class Main {
	void main() {
		
		Scanner sc = new Scanner(System.in);
		
		
		int choice = 0;
		do{
			IO.println("Enter The Choice");
			
			
			IO.println("1. HomeLoan");
			IO.println("2. CarLoan");
			IO.println("3. Exit");
			
			choice = sc.nextInt();
			
				HomeLoan hl = new HomeLoan();
				CarLoan cl = new CarLoan();
				
				double amount = 0;
				double rate = 0;
				double interest = 0;

			switch(choice) {
				case 1 :
					IO.println("Enter The Amount");
					amount = sc.nextDouble();
					IO.println("Enter The Rate Of Interest");
					rate = sc.nextDouble();
			interest = cl.calculateInterest(amount, rate);
            System.out.println("Interest: " + interest);

				break;
				
				case 2 :
					 IO.println("Enter The Amount");
					amount = sc.nextDouble();
					IO.println("Enter The Rate Of Interest");
					rate = sc.nextDouble();
				 interest = cl.calculateInterest(amount, rate);
					System.out.println("Interest: " + interest);
				break;
			}
		}
		while(choice == 1 || choice ==2 && choice != 3);
	}
}