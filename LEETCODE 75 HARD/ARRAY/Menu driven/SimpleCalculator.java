import java.util.Scanner;

class SimpleCalculator {
	  void main() {
		   Scanner sc = new Scanner(System.in);

				int choice ;
			do {
			
			System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
			
				choice = sc.nextInt();
				
				if(choice >=1 && choice <= 4) {

				
				System.out.println("Enter Two Numbers");
				int first =  sc.nextInt();
				int second = sc.nextInt();
				
				 switch (choice) {
					 case 1 :
						System.out.println("Addition : " + (first + second));
						break;
						
					 case 2 :
						System.out.println("Substraction : " + (first - second));
						break;
						
					 case 3 :
						System.out.println("Multiplication : " + (first * second));
						break;
						
					 case 4 :
						if(	second !=0){
							System.out.println("Division : " + (first / second));
						}
						else {
							System.out.println("Division by zero is Not Allowed: ");
						}
						break;
				 }
				}
			}
			while(choice != 5);
			   sc.close();
			   System.out.println("Thank You");
		}
	
	}
