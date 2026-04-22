package Math;

class CheckNumberIsArmstrongOrNot{
	 public static void main (String [] args) {
		// int num = 153;
		// String str = String.valueOf(num);
			// int k = str.length();
			// int pow = 0;
			// int res = 0;
			
			//this is first approach with useing strings so 
			//precortions
			//i always forget to convert character to integer ???
			//whenever doing that remember that when we convert string character 
			//so it compares not character it compares ascii value of perticular character 
			//so to overcome that problem what we do we substract with 0;
			// O(log n)  
			
			
			// for(int i = 0; i<k;i++) {
				 // int c = str.charAt(i) - '0';
				 // pow = ((int)Math.pow(c,k));
				 // res += pow;
		// }
				// boolean bl = res==num?true:false;
			// System.out.println(bl);
			
			
			//now here is the next approach 
			//lets do it with using another approach
			
			int num = 153;
			int lastdigit = 0;
			int temp = num;
			int k = 0;
			while (temp>0) {
				temp = temp/10;
				k++;
			}
			System.out.println(k);
			temp = num;
			int res =0;
			while (temp>0) {
				lastdigit = temp%10;
				res += (int)Math.pow(lastdigit,k);
				temp = temp/10;
			}
			boolean bl = res==num;
						System.out.println(bl);
						
						//this approach is perfectly fine compared 
						// to first one and but its time complexity is O(log n)
						//both approach time complexity is same
    }
}