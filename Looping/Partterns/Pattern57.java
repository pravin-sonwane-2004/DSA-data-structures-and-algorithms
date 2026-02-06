
// Q57. Write a java program to print this pattern.

	    	//     1
   		   //    1    1
		  //   1   		1
 	     //  1     		  1
		// 1   2   3	4	1



class Pattern57 {

    public static void main(String[] a) {

        for (int i = 1; i <= 5; i++) {
            int count = 1;

            for (int j = 1; j <= 9; j++) {

                if (i <= 4 && (j == 6 - i || j == 4 + i)) {
                    System.out.print("1");
                }

                else if (i == 5 && j % 2 == 1) { 
                    // positions for numbers: j = 1,3,5,7,9
                    System.out.print(count++);
                    if (count == 5) count = 1;
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
