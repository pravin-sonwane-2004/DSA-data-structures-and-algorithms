public class CheckNumberIsPelindrome {
	public static void main(String [] args) {
		
		int reverse = 0;
		int num = 121;
		int oregional = num;
		int lastDigit = 0;
		int compare = num;
		//System.out.println("Pravin");
		/*
	    for(int i = num;i>0;i=i/10){
		lastDigit = num%10;
		reverse = reverse*10+lastDigit;
		num = num/10;
				
	    }
System.out.println(reverse);
	*/
	
	
	//with using while it seems easy 
	while (num>0) {
		lastDigit = num%10;    
		reverse = reverse*10+lastDigit;
		num = num/10;
	}
			boolean result = oregional == reverse ? true : false;
				System.out.println(result);
	}
}