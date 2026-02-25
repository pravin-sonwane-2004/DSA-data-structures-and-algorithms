// 🟢 Level 1 (Fixed Window Basics)

// Find sum of each subarray of size k.

// Find average of each subarray of size k.

// Count even numbers in each subarray of size k.

// First negative number in each window of size k.

public class Practice {
	// Find sum of each subarray of size k.

	void sumSubArr(int arr [],int k) {
		int sum = 0;
		  for(int i =0;i<k;i++) {
			  sum += arr[i];
		  }
		  System.out.println(sum);
		  for(int i =k;i<arr.length;i++) {
			   sum+= arr[i]-arr[i-k];
			   System.out.println(sum);
		  }
	}
	 // Find average of each subarray of size k.
	 void avgSubArr(int arr [],int k) {
		int sum = 0;
		int avg = 0;
		  for(int i =0;i<k;i++) {
			  sum += arr[i];
		  }
		  avg = sum/k;
		  System.out.println(avg);
		  for(int i =k;i<arr.length;i++) {
			   sum+= arr[i]-arr[i-k];  
			   avg = sum/k;
				System.out.println(avg);
			   
		  }
	}

	
	// First negative number in each window of size k.
		void negativeNum(int arr [],int k) {
		int count = 0;
		int avg = 0;
		  for(int i =0;i<k;i++) {
			  if((arr[i] < 0)) {
				  System.out.println(arr[i]);
				  break;
			  }
		  }
		 
		  System.out.println(count);
		  for(int i =k;i<arr.length;i++) {
				if((arr[i] < 0)) {
				  System.out.println(arr[i]);
				  break;
			  }
		  }
	}
	
	
	  public static void main (String [] args) {
		  int arr [] = {12,45,5,32,12,21,33,4,5};
 // 2
// 0
// 0
// 1
// 2
// 2
// 3

		  int k = 3;
		  Practice p = new Practice();
		  p.countEven(arr,k);
	  }
}
   