	   /*
	4. **Number Operations**
	   Menu:

	   1. Square of a number
	   2. Cube of a number
	   3. Factorial
	   4. Exit
	   */
	import java.util.Scanner;

	class NumberOperations {
		void main() {
		Scanner sc = new Scanner(System.in);
		int choice ;	
		int a,b=0;
		int d = 1;
			do{
				
					System.out.println("1. Square of a number");
					System.out.println("2. Cube of a number");
					System.out.println("3. Factorial");
					System.out.println("4. Exit");
					System.out.println("Enter Choice : ");
					choice = sc.nextInt();
					
			int fact = 1;		
			switch(choice) {
				case 1:  System.out.println("Enter A Number: ");
				a = sc.nextInt();
				b= a*a;
				System.out.println(a +" square is : "+b);
				break;
				
				case 2:   System.out.println("Enter The Number: ");
				a = sc.nextInt();
				d = a*a*a;
				System.out.println(a + " cube is : "+d);
				break;
				
				case 3:   System.out.println("Enter The Number: ");
					a = sc.nextInt();
					for(int i=1;i<=a;i++) {
						fact = fact*i;
					}
					System.out.println(a+ " factorial is : " +fact);
				break;
			}
					

			}
			
			while(choice != 4);
		}
	}