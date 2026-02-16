// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]
 
import java.util.*;
class TwoSum{
	static int [] arr(int arr[],int target) {
		for(int i=0;i<arr.length-1;i++){
				if(arr[i]+arr[i+1]==target) {
					return new int [] {i,i+1};
			}
		}   
		return new int []{};
	}
	void main() {
		int target = 9;
		int [] nums =  {3,2,4};
		IO.println(Arrays.toString(arr(nums,target)));
		
	}
}