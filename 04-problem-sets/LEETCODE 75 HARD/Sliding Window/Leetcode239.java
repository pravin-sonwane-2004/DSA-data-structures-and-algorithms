import java.util.*;
class Leetcode239 {
    // public void maxSlidingWindow(int[] nums, int k) {
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i = k;i<nums.length;i++) {
            // int max =0;
            // for(int j = i-k;j<=i;j++) {
                // max = Math.max(max,nums[j]);
            // }
            // list.add(max);
        // }
		 // IO.println(list);
    // }
	//this is not accepted on leetcode
	
       public int[] maxSlidingWindow(int[] nums, int k) {
        int arr [] = new int [nums.length - k +1];
            for(int i =0 ;i<=nums.length-k;i++) {
                int max = Integer.MIN_VALUE;
                for(int j = i ;j<i+k;j++) {
                    max = Math.max(max,nums[j]);
                }
                arr[i] = max;
            }
            return arr;
        }
	void main() {
		int arr[] =  {1,3,-1,-3,5,3,6,7};
		maxSlidingWindow(arr,3);
	}
}

