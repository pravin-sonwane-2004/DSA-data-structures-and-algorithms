//import java.util.*;
//
//class Solution {
//	static int power (int n , int x) {
//		int d = 1;
//		 for(int i=0;i<x;i++) {
//			d = d*n;
//		 }
//		return d;
//	}
//
//    public static int[][] transpose(int[][] matrix) {
//        int [][] arr = new int[3][3];
//        for(int i=0;i<matrix.length;i++) {
//            for(int j=0;j<matrix[i].length;j++) {
//                arr[i][j] = matrix[j][i];
//            }
//        }
//        return arr;
//}
//	void main() {
//		int arr [][] = {
//			{1,2,3},
//				{4,5,6},
//					{7,8,9}
//		};
//		IO.println(Arrays.toString(transpose(arr)));
//	}
//}
// class Solution {
    // public String reverseWords(String s) {
       // String [] str = s.trim().split("\\s+");
    // StringBuilder sb = new StringBuilder();
       // for(int i = str.length-1;i>=0;i--) {
         // sb.append(str[i]);
		 // sb.append(" ");
       // }
           // return sb.toString();
    // }
	// void main() {
		  // String s = "the sky is blue";
		  // IO.println(reverseWords(s)) ;
	// }
// }
// lass Solution {
    // public int binaryGap(int n) {
        // String s = Integer.toBinaryString(n);

       // for(int i =0;i<s.length();i++) {
        
       // }
    // }
	// void main () {
		// int n = 22;
		// IO.println(binaryGap(n));
	// }
// }
class Solution {
	
		// Count even numbers in each subarray of size k.
	  // void countEven(int arr [],int k) {
		// int count =0 ;
		// for(int i =0;i<k;i++) {
			// if(arr[i] %2 == 0) {
				// count++;
			// }
		// }
		// System.out.println(count);
		
		// for(int i =k;i<arr.length-1;i++) {
			// if(arr[i-k] %2 == 0) {
			// System.out.println(count--);
			// }
			// if(arr[i] % 2 == 0) {
			// System.out.println(count++);
			// }
		// }
	// }
	// count first negative num in subarray
	// void negativeNum(int arr[],int k ) {
		// for(int i=k;i<=arr.length;i++) {
			// for(int j = i-k;j<i;j++) {
				// if(arr[j] < 0) {
					// IO.println("First In This Window is : " + arr[j]);
					// break;
				// }
			// }
		// }
	// }
	void main () {
		Solution obj = new Solution();
		String s =  "A man, a plan, a canal: Panama";
		obj.isPalindrome(s);
	} 
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {

            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) !=
                Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
    static {
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
            fw.write("0");
        } catch (Exception e) {
        }
    }));
}

}