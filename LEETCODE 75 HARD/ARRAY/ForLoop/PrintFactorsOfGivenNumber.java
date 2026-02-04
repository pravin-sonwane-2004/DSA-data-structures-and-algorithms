public class PrintFactorsOfGivenNumber{ 
	public static void main (String [] args) {
		int num = 10;
		for(int i =1;i<num/2+1;i++){
			if(num%i==0) {
				System.out.println(i);
			}
		}
    }
}