// import java.util.*;       

// // Input: height = [1,8,6,2,5,4,8,3,7]
// // Output: 49
// // Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
// //In this case, the max area of water (blue section) the container can contain is 49.
// // Example 2:

// // Input: height = [1,1]
// // Output: 1
// class A {
//     A() {
//         System.out.println("A Constructor");
//         show();
//     }

//     void show() {
//         System.out.println("A show");
//     }
// }

// class B extends A {
//     int x = 10;

//     B() {
//         System.out.println("B Constructor");
//     }

//     void show() {
//         System.out.println("B show, x = " + x);
//     }
// }

public class Solution {
    public static void main(String[] args) {

    }
}
// class Solution {
    // public int subarraySum(int[] nums, int k) {
		// Map<Integer,Integer> map = new HashMap<>();
		// int sum = 0 , count = 0;
		
		// map.put(0,1);
		// for(int i=0;i<nums.length;i++) {
			// sum+= nums[i];
			// if(map.containsKey(sum-k)) {
				// count += map.get(sum-k);
			// }
			// map.put(sum,map.getOrDefault(sum,0)+1);
		// }
		// return count;
	// }
	// void main() {
	// int arr [] = new int[]{2,3,5,3,1,3,8};
	// IO.println(subarraySum(arr,8));	
	// }
// }

// class Solution {

    // public List<Integer> findDisappearedNumbers(int[] nums) {

        // int i = 0;

        // while(i < nums.length) {

            // int correct = nums[i] - 1;

            // if(nums[i] != nums[correct]) {
                // int temp = nums[i];
                // nums[i] = nums[correct];
                // nums[correct] = temp;
            // }
            // else {
                // i++;
            // }
        // }

        // List<Integer> list = new ArrayList<>();

        // for(int j = 0; j < nums.length; j++) {
            // if(nums[j] != j + 1) {
                // list.add(j + 1);
            // }
        // }

        // return list;
    // }
	// void main () {
		// int arr [] = {4,3,2,7,8,2,3,1};
		 // IO.println(findDisappearedNumbers(arr));
	// }
// }
// class Solution {
    // public List<Integer> findDisappearedNumbers(int[] nums) {
        // List<Integer> list = new ArrayList<>();

        // for(int i = 0; i < nums.length; i++) {
            // int index = Math.abs(nums[i]) - 1;
            // if(nums[index] > 0) {
                // nums[index] = -nums[index];
            // }
        // }

        // for(int i = 0; i < nums.length; i++) {
            // if(nums[i] > 0) {
                // list.add(i + 1);
            // }
        // }

        // return list;
    // }
	
	// void main () {
		// int arr [] = {4,3,2,7,8,2,3,1};
		 // IO.println(findDisappearedNumbers(arr));
	// }
// }
// class Solution {
    // public boolean exist(char[][] board, String word) {
        // for(int i = 0;i<board.length;i++) {
            // for(int j =0;j<board[i].length;j++) {
                // if(board[j].equals(word)) {
                    // word.charAr(i) = " ";
                // }
            // }
        // }
        // for(int i=0;i<word.length();i++) {
            // if(word(i) != " ") {
                // return false;
            // }
        // }
        // return true;
    // }
	// void main() {
		// String [][] board = new String[][] {
		// {"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}
		// };
		// String word = "SEE";
		// exist(board,word);
	// }
// }


    // class Solution {
        // public int[] maxSlidingWindow(int[] nums, int k) {
        // int arr [] = new int [nums.length - k +1];
        // int b = 0;
            // for(int i =k ;i<=nums.length;i++) {
               // int max = 0;
               // for(int j = i-k;j<i;j++) {
                    // max = Math.max(max,nums[j]);
               // }
              // arr[b++] = max; 
            // }
            // return arr;
        // }
		// int []  mergeTwoArrays( int arr1 [] , int arr2 []) {
			// int merged[] = new int[arr1.length+arr2.length];
			// int i = 0;
			// int j = 0;
			// int k = 0;
		// while(i<arr1.length && j<arr2.length) {
				// if(arr1[i] < arr2[j]) {
					// merged[k++] = arr1[i++];
				// }
				// else {
					// merged[k++] = arr2[j++];
				// }
			// }
			// while(i<arr1.length) {
				// merged[k++] = arr1[i++];
			// }
			
			// while(j<arr2.length) {
				// merged[k++] = arr2[j++];
			// }
					// return merged; 
		// }
		
		
		// void  main() {
			// String s = "abcba";
			 // IO.println(
			 // );
		// }
    // }
	
	
	
	
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
// class Solution {
	
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
	// void main () {
		// Solution obj = new Solution();
		// String s =  "A man, a plan, a canal: Panama";
		// obj.isPalindrome(s);
	// } 
    // public boolean isPalindrome(String s) {
        // int l = 0, r = s.length() - 1;

        // while (l < r) {

            // while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                // l++;
            // }

            // while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                // r--;
            // }

            // if (Character.toLowerCase(s.charAt(l)) !=
                // Character.toLowerCase(s.charAt(r))) {
                // return false;
            // }

            // l++;
            // r--;
        // }

        // return true;
    // }
    // static {
    // Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        // try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
            // fw.write("0");
        // } catch (Exception e) {
        // }
    // }));
// }

// }