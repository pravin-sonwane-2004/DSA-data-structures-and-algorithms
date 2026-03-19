// Q1: Move all zeros to end (in-place, O(n))

import java.util.*;
 
class Move_all_zeros {
	public static void main(String [] args) {
		Move_all_zeros b = new Move_all_zeros();
		int arr[] = {2,0,56,0,7,7,0,6,0};
		int j = 0;
		int start = 0;
		int end = arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		while(j != arr.length) {
			arr[j]=0;
			j++;
		}
		System.out.println(Arrays.toString(arr));	
	}                  
	//lets try this another teqnick 
	// int [] shiftAllZeros(int arr[]) {
		// int j = 0;
		// int start = 0;
		// int end = arr.length-1;
		
		// while(start < end) {
			// if(arr[start] > 0 && arr[end] == 0) {
				// int temp = arr[start];
				// arr[start] = arr[end];
				// arr[end] = temp;
				// start++;
				// end--;
			// }
			// else if(arr[start] > 0 && arr[end] != 0) {
				// start++;
			// }
			// else {
				// end--;
			// }
		// }
		// return arr;
	// }
}