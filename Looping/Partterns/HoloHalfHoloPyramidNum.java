public class HoloHalfHoloPyramidNum {
	 public static void main (String [] args) {
		for(int i = 1;i<=5;i++) {  //1
			for(int j = 1; j<=5;j++)   { //i,j=1
				if(i==1 || j==1 || j==6-i) {  

					System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
    }
}