//approach i can follow for it 

// Sort array
// Left = 0, Right = n-1
// If sum == k → count++, move both
// If sum < k → left++
// If sum > k → right--
// Time: O(n log n)
// ////////////////////////////////////////////////
// 1679. Max Number of K-Sum Pairs
// In one operation, you can pick two numbers from the array whose sum equals
//  k and remove them from the array.
// Return the maximum number of operations you can perform on the array.

// Example 1:
// Input: nums = [1,2,3,4], k = 5
// Output: 2
// Explanation: Starting with nums = [1,2,3,4]:
// - Remove numbers 1 and 4, then nums = [2,3]
// - Remove numbers 2 and 3, then nums = []
// There are no more pairs that sum up to 5, hence a total of 2 operations.
// Example 2:

// Input: nums = [3,1,3,4,3], k = 6
// Output: 1
// Explanation: Starting with nums = [3,1,3,4,3]:
// - Remove the first two 3's, then nums = [1,4,3]
// There are no more pairs that sum up to 6, hence a total of 1 operation.

import java.util.Arrays;

public class Leetcode1679 {

    int retCount(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;
        int count = 0;

        // this is O(n^2); time complexity
//############################################
        // for(int i=0;i<nums.length;i++) {
        //     for(int j=0;j<nums.length-1;j++) {
        //         if(nums[j]>nums[j+1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }
        //////////////////////////////////
        //this is O(n log n) time complexity
        //needd to use merge sort 
        //////////////////////////////////
      IO.println(Arrays.toString(nums));

        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum == k) {
                count++;
                start++;
                end--;
            } else if (sum < k) {
                start++;
            } else {
                end--;
            }
        }

        return count;
    }
    void main() {
        int[] arr = {1, 2, 3, 4};
        int k = 5;
        IO.println(retCount(arr,k));
    }
}
