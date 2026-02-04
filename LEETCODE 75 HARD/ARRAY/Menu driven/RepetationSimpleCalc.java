import java.util.Scanner;

class RepetationSimpleCalc {
	void main() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do{
			System.out.println("Enter Two Numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Enter  Your Choice : ");
			choice = sc.nextInt();
			System.out.println(); 
			
			
			
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println(); 
			

		switch(choice) {
			case 1 :  System.out.println("Addition is : " + (a+b));
						break;
				
			case 2 :  System.out.println("Subtraction is : " + (a-b));
						break;
						
			case 3 :  System.out.println("Multiplication is : " + (a*b));
						break;
			case 4 : if(b == 0) {
						System.out.println("Cant Be Devided By 0 ");
					}
					else {
						System.out.println("Division : " + (a/b));
					}
					break;
					
			case 5 : System.out.println("Exitting !!!");
						
			default : System.out.println("Thank You $ ");
		}
		}
		while(choice!=5);
	}
}