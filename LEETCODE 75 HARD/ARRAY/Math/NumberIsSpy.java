package Math;

class NumberIsSpy {
	 public static void main(String [] args){
		int lastdigit=0;
		int mult = 1;
		int sum = 0;
		int num =123;
		boolean flag = false;
		while(num>0) {
			lastdigit = num %10;
			sum += lastdigit;
			mult *= lastdigit;
			num = num /10;
		}
		flag = mult == sum ? true : false;
			 System.out.println(flag);
		
	 }
}