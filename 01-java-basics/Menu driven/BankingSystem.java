// 7. **Banking System**
   // Menu:

   // 1. Deposit
   // 2. Withdraw
   // 3. Check Balance
   // 4. Exit
import java.util.Scanner;
class BankingSystem {
	 void main() {
		 
		 Scanner sc = new Scanner(System.in);
		 int deposit = 0;
		 int withdraw = 0;
		 int balance= 0;
		 int choice = 0;
		 
		 System.out.println("1. Deposit : ");
		 System.out.println("2. Withdraw");
		 System.out.println("3. Check Balance");
		 System.out.println("4. Exit");
		 
		 
		 
		 
		 do{
			 		
					 System.out.println("Enter Your Choice : ");
						choice = sc.nextInt();
			
					 switch (choice) {
				 case 1: 
					System.out.println("Enter the amount to Deposit: ");
					deposit = sc.nextInt();
					balance = deposit;
					break;
				
				 case 2:
				   if(balance < withdraw) {
						System.out.println("Insufficient Balance !!!");
				   }
				   else {
					   balance = balance-withdraw;
				   }
				   break;
				 case 3: 
				  if(balance !=0)  {
					 System.out.println("Your balance is : " + balance);
				 }
				 else {
					 System.out.println("Balance is Zero : ");
				 }
				  break;
				default : 
					System.out.println("Thank You ");
				 break;
			 }
			 
		 }
		 while(choice !=4);
	 }
}