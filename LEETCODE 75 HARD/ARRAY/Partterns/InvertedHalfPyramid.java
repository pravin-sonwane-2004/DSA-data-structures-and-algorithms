public class InvertedHalfPyramid {
	 public static void main (String [] args) throws Exception {
		for(int i = 1;i<=5;i++) {  //1
			for(int j = 1; j<=5;j++)   { //i,j=1
				if(j<7-i) {  
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}